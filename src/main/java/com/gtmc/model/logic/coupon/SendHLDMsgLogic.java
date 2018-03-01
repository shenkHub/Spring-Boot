package com.gtmc.model.logic.coupon;

import java.sql.SQLException;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gtmc.base.db.ServiceControl;
import com.gtmc.common.macrodef.GtmcConst.CommonValue;
import com.gtmc.common.macrodef.GtmcConst.ResourceFile;
import com.gtmc.model.dao.coupon.NewHLDerCouponDao;
import com.gtmc.util.DateUtil;
import com.gtmc.util.PropertyUtil;

public class SendHLDMsgLogic extends Thread {
    /** 日志对象 */
    private static Logger logger = LoggerFactory.getLogger(SendHLDMsgLogic.class);
    // 手机号
    private String telNo;
    // 短信内容
    private String sendMsgCnt;
    // 车架号
    private String vinNo;
    // 优惠券码
    private String couponId;

    public SendHLDMsgLogic(String telNo, String sendMsgCnt, String vinNo, String couponId) {
        this.telNo = telNo;
        this.sendMsgCnt = sendMsgCnt;
        this.couponId = couponId;
        this.vinNo = vinNo;
    }

    @Override
    public void run() {
        logger.info("全新汉兰达活动短信发送Logic_通知短信发送开始");
        ServiceControl serviceControl = new ServiceControl();
        try {
            boolean sendFlag = sendMsg(telNo, sendMsgCnt);
            logger.info("短信发送flag：" + sendFlag);
            serviceControl.getConnection();
            NewHLDerCouponDao dao = new NewHLDerCouponDao(serviceControl);
            if (sendFlag) {
                dao.updateHLDReceive("1", CommonValue.NULL_SPACE, telNo, vinNo, couponId, DateUtil.getSysDate());
            } else {
                dao.updateHLDReceive("2", "短信发送失败", telNo, vinNo, couponId, null);
            }
            serviceControl.commit();
        } catch (Exception e) {
            try {
                serviceControl.rollback();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            logger.error("全新汉兰达活动短信发送Logic_通知短信发送失败");
            logger.error("错误原因：" + e.getMessage());
            logger.error("错误位置：" + e.getStackTrace().toString());
        } finally {
            try {
                serviceControl.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        logger.info("全新汉兰达活动短信发送Logic_通知短信发送结束");
    }

    /**
     * 发送短信
     * 
     * @param telNo
     * @param smsContent
     * @return
     * @throws Exception
     */
    private boolean sendMsg(String telNo, String smsContent) throws Exception {
        logger.info("短信发送开始");
        logger.info("用户号码：" + telNo);
        logger.info("短信内容:" + smsContent);
        boolean sendFlag = false;
        // SMS服务器
        String targetEendPointTo = PropertyUtil.getValueByKey(ResourceFile.SERVICE_URL, ResourceFile.SMS_SERVICE);
        org.apache.axis.client.Service service = new org.apache.axis.client.Service();
        org.apache.axis.client.Call call = (org.apache.axis.client.Call) service.createCall();
        call.setTargetEndpointAddress(new java.net.URL(targetEendPointTo));
        call.setOperationName(new QName(targetEendPointTo, "sendSmsUncheckBlacklist"));// 设置方法名
        // 设置电话号码
        String[] telNos = new String[] { telNo };
        int userId = 2802; // 短信平台上注册的用户ID
        int msgTypeId = 671; // 短信类型
        sendFlag = (Boolean) call.invoke(new Object[] { telNos, smsContent, msgTypeId, userId });
        logger.info("短信发送结束");
        return sendFlag;
    }
}
