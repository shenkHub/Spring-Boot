package com.gtmc.model.service.impl.coupon;

import java.util.Arrays;
import java.util.List;

import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.gtmc.common.macrodef.GtmcConst.MessageId;
import com.gtmc.common.macrodef.GtmcConst.ReturnFlg;
import com.gtmc.model.bean.input.coupon.NewHLDerCouponInput;
import com.gtmc.model.bean.output.coupon.NewHLDerCouponOutput;
import com.gtmc.model.logic.coupon.NewHLDerCouponLogic;
import com.gtmc.model.service.coupon.NewHLDerCouponService;
import com.gtmc.util.MessageUtil;
import com.gtmc.util.StringUtil;

@WebService(targetNamespace = "http://gtms.com/")
@Component
public class NewHLDerCouponServiceImpl implements NewHLDerCouponService {
    /** 日志对象 */
    private static Logger logger = LoggerFactory.getLogger(NewHLDerCouponServiceImpl.class);

    /**
     * 全新汉兰达活动领券
     */
    @Override
    public NewHLDerCouponOutput getNewHLDerCoupon(NewHLDerCouponInput input) {
        logger.info("======================G-club系统-全新汉兰达车主关怀活动领券開始。======================");
        NewHLDerCouponOutput output = new NewHLDerCouponOutput();
        int returnFlag = ReturnFlg.SUCESS;
        String errorMessage = MessageUtil.getMessage(MessageId.I_S_10000);
        try {
            if (null == input) {
                errorMessage = MessageUtil.getMessage(MessageId.I_S_10003);
                returnFlag = ReturnFlg.INCORRECT_PARAMETER;
                logger.info(errorMessage + "\n输入参数为空");
            } else {
                // 输入参数打印
                logger.info("输入参数打印" + "\n用户手机号：" + input.getTelNo() + "\n车架号：" + input.getVinNoList());
                if (!checkVinNo(input.getVinNoList()) || StringUtil.isEmpty(input.getTelNo())) {
                    // input未设定
                    returnFlag = ReturnFlg.INCORRECT_PARAMETER;
                    errorMessage = MessageUtil.getMessage(MessageId.I_S_10003);
                    logger.info(errorMessage);
                } else if (StringUtil.overLength(input.getTelNo(), 11)) {
                    returnFlag = ReturnFlg.INCORRECT_PARAMETER;
                    errorMessage = MessageUtil.getMessage(MessageId.E_S_10006, new String[] { "手机号" });
                } else {
                    NewHLDerCouponLogic logic = new NewHLDerCouponLogic();
                    output = logic.getNewHLDerCoupon(input);
                }
            }
        } catch (Exception e) {
            errorMessage = MessageUtil.getMessage(MessageId.E_S_99999);
            returnFlag = ReturnFlg.EXCEPTION;
            logger.error("G-club系统-全新汉兰达车主关怀活动领券接口:系统异常");
            logger.error("出错原因:" + e.getMessage());
            logger.error("出错位置:" + Arrays.toString(e.getStackTrace()));
            logger.error("输入参数打印" + "\n用户手机号：" + input.getTelNo() + "\n车架号：" + input.getVinNoList());
        }
        // ======================Output参数设定=========================
        output.setErrorMessage(errorMessage);
        output.setReturnFlag(returnFlag);
        logger.info("输出结果打印" + "\n" + "提示信息:" + output.getErrorMessage() + "\n" + "处理结果：" + output.getReturnFlag()
                + "\n" + "领券结果：" + output.getResult() + "\n" + "车架号：" + output.getVinNoList() + "\n" + "优惠券码："
                + output.getCouponIdList());
        logger.info("======================G-club系统-全新汉兰达车主关怀活动领券结束。======================");
        return output;
    }

    /**
     * 车架号非空check
     * 
     * @param vinNoList
     * @return
     */
    private boolean checkVinNo(List<String> vinNoList) {
        logger.info("车架号非空check开始");
        if (vinNoList == null || vinNoList.isEmpty()) {
            return false;
        }
        for (String vinNo : vinNoList) {
            if (StringUtil.isEmpty(vinNo)) {
                return false;
            }
        }

        logger.info("车架号非空check结束");
        return true;
    }
}
