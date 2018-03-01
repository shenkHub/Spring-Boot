package com.gtmc.model.dao.coupon;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

import com.gtmc.base.dao.BaseDao;
import com.gtmc.base.db.ServiceControl;
import com.gtmc.common.macrodef.GtmcConst.SqlId;
import com.gtmc.util.DateUtil;

public class NewHLDerCouponDao extends BaseDao implements Serializable {
    /** serialVersion */
    private static final long serialVersionUID = 1L;

    public NewHLDerCouponDao(ServiceControl serviceControl) {
        super(serviceControl);
        // TODO Auto-generated constructor stub
    }

    /**
     * 查询用户是否已注册
     * 
     * @param telNo
     * @return
     * @throws Exception
     */
    public List<HashMap<Object, Object>> getUserGtmc(String telNo) throws Exception {
        List<HashMap<Object, Object>> resultSetList = super.doSelect(SqlId.SQL_SELECTUSERISEXIST_001, telNo);
        return resultSetList;
    }

    /**
     * 查询用户车辆信息
     * 
     * @param vinNo
     * @param uidGtmc
     * @return
     * @throws Exception
     */
    public List<HashMap<Object, Object>> getUserCar(String vinNo, String uidGtmc) throws Exception {
        List<HashMap<Object, Object>> resultSetList = super.doSelect(SqlId.SQL_SELECTUSERCARFORHLD_001, uidGtmc, vinNo);
        return resultSetList;
    }

    /**
     * 查询车辆是否已领取过优惠券
     * 
     * @param vinNo
     * @return
     * @throws Exception
     */
    public List<HashMap<Object, Object>> getReceivedCoup(String vinNo) throws Exception {
        List<HashMap<Object, Object>> resultSetList = super.doSelect(SqlId.SQL_SELECTISRECEIVED_001, vinNo);
        return resultSetList;
    }

    /**
     * 查询未发放的优惠券
     * 
     * @return
     * @throws Exception
     */
    public List<HashMap<Object, Object>> getHLDCouponId() throws Exception {
        List<HashMap<Object, Object>> resultSetList = super.doSelect(SqlId.SQL_SELECTCOUPONIDBYWXCOUPFORHLD_001);
        return resultSetList;
    }

    /**
     * 将优惠券与用户进行绑定
     * 
     * @param couponId
     * @param telNo
     * @param UidGtmc
     * @throws Exception
     */
    public void savaBindCoup(String couponId, String telNo, String UidGtmc, String vinNo) throws Exception {
        super.doUpdate(SqlId.SQL_UPDATEWXCOUPFORHLD_001, UidGtmc, telNo, DateUtil.getSysDate(), vinNo, couponId);
    }

    /**
     * 保存领券信息
     * 
     * @param couponId
     * @param telNo
     * @param vinNo
     * @param message
     * @throws Exception
     */
    public void savaHLDReceive(String couponId, String telNo, String vinNo, String message) throws Exception {
        super.doUpdate(SqlId.SQL_INSERTHLDRECEIVE_001, telNo, vinNo, couponId, message);
    }

    /**
     * 更新短信发送状态
     * 
     * @param sendStatus
     * @param errorMsg
     * @param telNo
     * @param vinNo
     * @param couponId
     * @throws Exception
     */
    public void updateHLDReceive(String sendStatus, String errorMsg, String telNo, String vinNo, String couponId,
            String sendDate) throws Exception {
        super.doUpdate(SqlId.SQL_UPDATEHLDRECEIVE_001, sendStatus, errorMsg, sendDate, sendDate, telNo, vinNo,
                couponId);
    }

    /***
     * 查询优惠券信息
     * 
     * @param couponId
     * @return
     * @throws Exception
     */
    public List<HashMap<Object, Object>> getWxCoupon(String couponId) throws Exception {
        List<HashMap<Object, Object>> resultList = super.doSelect(SqlId.SQL_SELECTHLDWXCOUPON_001, couponId);
        return resultList;
    }
}
