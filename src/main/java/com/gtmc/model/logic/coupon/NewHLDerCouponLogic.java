package com.gtmc.model.logic.coupon;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gtmc.base.db.ServiceControl;
import com.gtmc.client.generate.app.MQ3003.SendCouponInfo;
import com.gtmc.common.macrodef.GtmcConst.CouponKbn;
import com.gtmc.common.macrodef.GtmcConst.ResourceFile;
import com.gtmc.model.bean.input.coupon.NewHLDerCouponInput;
import com.gtmc.model.bean.input.coupon.SaveCouponContentEip2appInput;
import com.gtmc.model.bean.output.coupon.NewHLDerCouponOutput;
import com.gtmc.model.dao.coupon.NewHLDerCouponDao;
import com.gtmc.util.PropertyUtil;
import com.gtmc.util.StringUtil;

/**
 * 全新汉兰达活动领券logic
 * 
 * @author Hoperun
 *
 */
@Service
public class NewHLDerCouponLogic {

    /** 日志对象 */
    private static Logger logger = LoggerFactory.getLogger(NewHLDerCouponLogic.class);

    /** '2':微信优惠券活动ID */
    private static String EVENT_ID_TYPE_WX = "2";
    // 活动开始日
    private final String startDate = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.HLDBEGINTIME);
    // 活动结束日
    private final String endDate = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.HLDENDTIME);
    //短信内容
    String sendHLDMsg = PropertyUtil.getValueByKey(ResourceFile.PRO_SYSTEM_NM, ResourceFile.HLDMSG);

    public NewHLDerCouponOutput getNewHLDerCoupon(NewHLDerCouponInput input) throws Exception {
        logger.info("全新汉兰达车主关怀活动Logic_领券开始");
        NewHLDerCouponOutput output = new NewHLDerCouponOutput();
        output.setVinNoList(new ArrayList<String>());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // 判断活动有效期
        if (format.format(new Date()).compareTo(startDate) < 0 || format.format(new Date()).compareTo(endDate) > 0) {
            logger.info("不在活动周期内");
            output.setResult(4);
            logger.info("全新汉兰达车主关怀活动Logic_领券结束");
            return output;
        }
        ServiceControl serviceControl = new ServiceControl();
        try {
            serviceControl.getConnection();
            NewHLDerCouponDao dao = new NewHLDerCouponDao(serviceControl);
            // 查询用户是否已注册
            List<HashMap<Object, Object>> resultSetList = dao.getUserGtmc(StringUtil.alltrim(input.getTelNo()));
            if (resultSetList == null || resultSetList.size() < 1) {
                logger.info("用户" + input.getTelNo() + "未注册");
                output.setResult(1);
            } else {
                String uidGtmc = StringUtil.valueOf(resultSetList.get(0).get("UID_GTMC"));
                input.setVinNoList(vinNoDistinct(input.getVinNoList()));
                logger.info("去重后车架号："+input.getVinNoList());
                // check车架号是否满足领券条件
                if (!checkVinNoIsExist(dao, input.getVinNoList(), uidGtmc, output)) {
                    logger.info("车架号不正确");
                    output.setResult(2);
                    logger.info("全新汉兰达车主关怀活动Logic_领券结束");
                    return output;
                }
                if (isReceivedCoup(dao, input.getVinNoList(), output)) {
                    logger.info("存在车架号已领取过优惠券");
                    output.setResult(3);
                    logger.info("全新汉兰达车主关怀活动Logic_领券结束");
                    return output;
                }
                // 发送优惠券
                List<String> couponIdList = grantCoupon(input, uidGtmc, dao);
                if (couponIdList.size() > 0) {
                    serviceControl.commit();
                    // 发送短信
                    sendMsg(input, couponIdList);
                    // 优惠券同步
                    for (String couponId : couponIdList) {
                        syncHLDCoupon(dao, couponId, serviceControl, uidGtmc, StringUtil.alltrim(input.getTelNo()));
                    }
                    output.setVinNoList(input.getVinNoList());
                    output.setCouponIdList(couponIdList);
                } else {
                    logger.info("优惠券已被发放完");
                    output.setResult(5);
                }
            }
        } catch (Exception e) {
            serviceControl.rollback();
            logger.error("全新汉兰达车主关怀活动Logic_领券异常");
            logger.error("出错原因：" + e.getMessage());
            logger.error("出错位置：" + e.getStackTrace().toString());
            throw new Exception(e);
        } finally {
            serviceControl.close();
        }
        logger.info("全新汉兰达车主关怀活动Logic_领券结束");
        return output;
    }

    /**
     * 查询各车架号是否正确
     * 
     * @param dao
     * @param vinNoList
     * @param uidGtmc
     * @return
     * @throws Exception
     */
    private boolean checkVinNoIsExist(NewHLDerCouponDao dao, List<String> vinNoList, String uidGtmc,
            NewHLDerCouponOutput output) throws Exception {
        logger.info("全新汉兰达车主关怀活动Logic_check各车架号是否正确开始");
        boolean isExist = true;
        for (String vinNo : vinNoList) {
            List<HashMap<Object, Object>> resultSetList = dao.getUserCar(StringUtil.alltrim(vinNo), uidGtmc);
            if (resultSetList == null || resultSetList.size() < 1) {
                logger.info("车架号不正确，车架号：" + vinNo + " 统合管理ID：" + uidGtmc);
                output.getVinNoList().add(vinNo);
                isExist = false;
                break;
            }
        }
        logger.info("全新汉兰达车主关怀活动Logic_check各车架号是否正确结束");
        return isExist;
    }

    /**
     * 
     * @param dao
     * @param vinNoList
     * @return
     * @throws Exception
     */
    private boolean isReceivedCoup(NewHLDerCouponDao dao, List<String> vinNoList, NewHLDerCouponOutput output)
            throws Exception {
        logger.info("全新汉兰达车主关怀活动Logic_check车辆是否已领取过优惠券开始");
        boolean isReceived = false;
        for (String vinNo : vinNoList) {
            List<HashMap<Object, Object>> resultSetList = dao.getReceivedCoup(StringUtil.alltrim(vinNo));
            if (resultSetList != null && resultSetList.size() > 0) {
                logger.info("车架号：" + vinNo + "已领取过优惠券：" + resultSetList.get(0).get("COUPON_ID"));
                isReceived = true;
                output.getVinNoList().add(vinNo);
                break;
            }
        }
        logger.info("全新汉兰达车主关怀活动Logic_check车辆是否已领取过优惠券结束");
        return isReceived;
    }

    /**
     * 取得本次发放的优惠券
     * 
     * @param vinNoList
     * @param uidGtmc
     * @param dao
     * @return
     * @throws Exception
     */
    private List<String> grantCoupon(NewHLDerCouponInput input, String uidGtmc, NewHLDerCouponDao dao)
            throws Exception {
        logger.info("全新汉兰达车主关怀活动Logic_发放优惠券开始");
        List<String> couponIdList = new ArrayList<>();

        List<HashMap<Object, Object>> couponList = dao.getHLDCouponId();
        if (couponList == null || couponList.size() < 1) {
            logger.info("优惠券已发完");
        } else {
            logger.info("优惠券剩余" + couponList.size() + "张");
            if (input.getVinNoList().size() > couponList.size()) {
                logger.info("剩余优惠券不够发放");
            } else {
                Random random = new Random(System.nanoTime());
                for (String vinNo : input.getVinNoList()) {
                    String couponId = "";
                    boolean isExist = true;
                    // 随机取得一个不重复的优惠券码
                    while (isExist) {
                        couponId = StringUtil
                                .valueOf(couponList.get(random.nextInt(couponList.size())).get("COUPON_ID"));
                        if (!couponIdList.contains(couponId)) {
                            isExist = false;
                        }
                    }
                    couponIdList.add(couponId);
                    logger.info("将优惠券与用户绑定开始");
                    dao.savaBindCoup(couponId, StringUtil.alltrim(input.getTelNo()), uidGtmc, vinNo);
                    logger.info("将优惠券与用户绑定结束");
                    logger.info("保存领券信息开始");
                    String message = sendHLDMsg.replace("XXXXX", couponId);
                    dao.savaHLDReceive(couponId, StringUtil.alltrim(input.getTelNo()), vinNo, message);
                    logger.info("保存领券信息结束");
                }
            }
        }
        logger.info("全新汉兰达车主关怀活动Logic_发放优惠券结束");
        return couponIdList;
    }

    /**
     * 发送短信
     * 
     * @param input
     * @param couponIdList
     */
    private void sendMsg(NewHLDerCouponInput input, List<String> couponIdList) {
        logger.info("全新汉兰达车主关怀活动Logic_调用线程发送短信开始");
        for (String couponId : couponIdList) {
            String message = sendHLDMsg.replace("XXXXX", couponId);
            String vinNo = input.getVinNoList().get(couponIdList.indexOf(couponId));
            SendHLDMsgLogic sendLogic = new SendHLDMsgLogic(StringUtil.alltrim(input.getTelNo()), message,
                    StringUtil.alltrim(vinNo), couponId);
            Thread thread = new Thread(sendLogic);
            thread.start();
        }
        logger.info("全新汉兰达车主关怀活动Logic_调用线程发送短信结束");
    }

    /**
     * 优惠券同步
     * 
     * @param dao
     * @param couponId
     * @param serviceControl
     * @param uidGtmc
     * @throws Exception
     */
    private void syncHLDCoupon(NewHLDerCouponDao dao, String couponId, ServiceControl serviceControl, String uidGtmc,
            String phone) throws Exception {
        logger.info("全新汉兰达车主关怀活动Logic_MQ同步优惠券开始");
        List<HashMap<Object, Object>> wxresultSetList = dao.getWxCoupon(couponId);

        if (wxresultSetList != null && wxresultSetList.size() > 0) {
            HashMap<Object, Object> resultSet = wxresultSetList.get(0);

            if (couponId.length() == 11 && couponId.startsWith("9003")) {
                // 券码规则
                logger.info("优惠券号非9003开头的11位");
            }
            // 判断数据合理性
            if (StringUtil.isEmpty(uidGtmc) && (!CouponKbn.COUPON_KBN_TACT.equals(resultSet.get("COUPON_KBN")))
                    && (!EVENT_ID_TYPE_WX.equals(StringUtil.valueOf(resultSet.get("SYSTEM_ID"))))) {
                logger.info("领取ID:不能为空,优惠劵分类:1,优惠券系统区分:2");
                return;
            }
            // 优惠券名称
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("CARD_ID")))) {
                logger.info("卡券ID(子活动代码)不能为空值");
                return;
            }
            // 券面金额
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("COUPON_CONTENT")))) {
                logger.info("优惠券内容不能为空值");
                return;
            }
            // 优惠券有效期开始时间
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("COUPON_BEGIN")))) {
                logger.info("有效期开始时间不能为空值");
                return;
            }
            // 优惠券有效期结束时间
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("COUPON_END")))) {
                logger.info("有效期结束时间不能为空值");
                return;
            }

            // 券面金额
            String couponContent = "0";
            if (StringUtil.alltrim(StringUtil.valueOf(resultSet.get("COUPON_ID"))).length() != 16) {
                couponContent = StringUtil.valueOf(resultSet.get("COUPON_CONTENT"));
            }

            // 优惠券类型
            int typeId = 1;
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("TYPE_ID")))) {
                typeId = 1;
            } else {
                typeId = StringUtil
                        .string2int(StringUtils.substring(StringUtil.valueOf(resultSet.get("TYPE_ID")), 0, 1));
            }

            // 卡券状态
            int status = 1;
            if (StringUtil.isEmpty(StringUtil.valueOf(resultSet.get("COUPON_STATUS")))) {
                status = 1;
            } else {
                status = StringUtil
                        .string2int(StringUtils.substring(StringUtil.valueOf(resultSet.get("COUPON_STATUS")), 0, 1));
            }
            String batchId = "30003";
            // MQ3003参数设定
            SaveCouponContentEip2appInput mq3003Input = new SaveCouponContentEip2appInput();
            mq3003Input.setCOUPON_ID(StringUtil.valueOf(resultSet.get("COUPON_ID")));
            mq3003Input.setBATCH_ID(batchId);
            mq3003Input.setPHONE(StringUtils.substring(phone, 0, 11));
            mq3003Input.setBC_ID(100);
            mq3003Input.setTC_ID(1);
            mq3003Input.setCOUPON_NAME(StringUtil.valueOf(resultSet.get("CARD_ID")));
            mq3003Input.setCOUPON_REMARK(StringUtil.valueOf(resultSet.get("COUPON_RULE")));
            mq3003Input.setCOPYRIGHT("优惠券最终解释权归发行方所有");
            mq3003Input.setSTATUS(1);
            mq3003Input.setGRANT_TYPE(1);
            if (typeId == 0) {
                if (couponContent.length() > 9) {
                    mq3003Input.setCOUPON_COST(StringUtil.string2int(StringUtils.substring(couponContent, 0, 9)));
                } else {
                    mq3003Input.setCOUPON_COST(StringUtil.string2int(couponContent));
                }
            } else {
                mq3003Input.setCOUPON_COST(0);
            }
            mq3003Input.setCOUPON_COUNT(0);
            mq3003Input.setCOUPON_AMOUNT(0);
            mq3003Input.setCOUPON_ISSUER("00000");
            mq3003Input.setFROM_APPLICATION(3);
            mq3003Input.setCONPON_USE_REMARK(StringUtil.valueOf(resultSet.get("COUPON_DETAIL")));
            mq3003Input.setCOUPON_TYPE(typeId);
            mq3003Input.setCOUPON_BEGIN(StringUtil.valueOf(resultSet.get("COUPON_BEGIN")));
            mq3003Input.setCOUPON_END(StringUtil.valueOf(resultSet.get("COUPON_END")));
            mq3003Input.setCOUPON_STATUS(status);
            mq3003Input.setORDER_ID(StringUtil.valueOf(resultSet.get("SRV_ORDER_NO")));
            mq3003Input.setDEALER_CODE(StringUtil.valueOf(resultSet.get("DEALER_CODE")));

            logger.info("调用app优惠劵同步MQ开始");
            String resultStr = SendCouponInfo.sendPost(serviceControl, mq3003Input);
            if ("200".equals(resultStr)) {
                logger.info("调用app优惠劵同步MQ成功");
            } else {
                logger.info("调用app优惠劵同步MQ失败。 优惠券号=" + mq3003Input.getCOUPON_ID() + "  手机号码=" + mq3003Input.getPHONE()
                        + "错误码：" + resultStr);
            }
            logger.info("调用app优惠劵同步MQ结束");
            logger.info("优惠券同步结束   优惠券ID：" + StringUtil.valueOf(resultSet.get("COUPON_ID")) + "  活动ID："
                    + StringUtil.valueOf(resultSet.get("EVENT_ID")));
        }
        logger.info("全新汉兰达车主关怀活动Logic_MQ同步优惠券结束");

    }

    // add for 领券车架号去重 by shen_kang 20180108 start
    private List<String> vinNoDistinct(List<String> vinNoList) {
        logger.info("全新汉兰达车主关怀活动Logic_车架号去重开始");
        List<String> resultList = new ArrayList<>();
        for (String vinNo : vinNoList) {
            if (!resultList.contains(StringUtil.alltrim(vinNo))) {
                resultList.add(StringUtil.alltrim(vinNo));
            }
        }

        logger.info("全新汉兰达车主关怀活动Logic_车架号去重结束");
        return resultList;
    }
    // add for 领券车架号去重 by shen_kang 20180108 end
}
