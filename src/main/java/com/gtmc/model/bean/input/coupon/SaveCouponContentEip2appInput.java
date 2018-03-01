package com.gtmc.model.bean.input.coupon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * iclub2app优惠劵同步接口Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class SaveCouponContentEip2appInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 优惠券号 */
    @XmlElement(required = true)
    private String COUPON_ID;

    /** 优惠券批次编号 */
    @XmlElement(required = true)
    private String BATCH_ID;

    /** 手机号码 */
    @XmlElement(required = true)
    private String PHONE;

    /** 业务场景编号 */
    @XmlElement(required = true)
    private int BC_ID;
    
    /** 触发条件编号 */
    @XmlElement(required = true)
    private int TC_ID;
    
    /** 优惠券名称 */
    @XmlElement(required = true)
    private String COUPON_NAME;
    
    /** 优惠券说明 */
    @XmlElement(required = true)
    private String COUPON_REMARK;
    
    /** 优惠券版权 */
    @XmlElement(required = true)
    private String COPYRIGHT;
    
    /** 发放状态 */
    @XmlElement(required = true)
    private int STATUS;
    
    /** 发放类型 */
    @XmlElement(required = true)
    private int GRANT_TYPE;
    
    /** 券面金额 */
    @XmlElement(required = true)
    private int COUPON_COST;
    
    /** 数量*/
    @XmlElement(required = true)
    private double COUPON_COUNT;
    
    /** 总额 */
    @XmlElement(required = true)
    private double COUPON_AMOUNT;

    /** 发行方 */
    @XmlElement(required = true)
    private String COUPON_ISSUER;
    
    /** 来源系统 */
    @XmlElement(required = true)
    private int FROM_APPLICATION;
    
    /** 优惠券使用规则说明 */
    @XmlElement(required = true)
    private String CONPON_USE_REMARK;
    
    /** 优惠券类型 */
    @XmlElement(required = true)
    private int COUPON_TYPE;
    
    /** 优惠券有效期开始时间 */
    @XmlElement(required = true)
    private String COUPON_BEGIN;
    
    /** 优惠券有效期结束时间 */
    @XmlElement(required = true)
    private String COUPON_END;
    
    /** 优惠券状态 */
    @XmlElement(required = true)
    private int COUPON_STATUS;
    
    /** 领取时间 */
    @XmlElement(required = true)
    private String PUBLISH_DATE;
    
    /** 使用时间 */
    @XmlElement(required = true)
    private String USEING_DATE;
    
    /** 核销时间 */
    @XmlElement(required = true)
    private String USEED_DATE;
    
    /** 绑定工单 */
    @XmlElement(required = true)
    private String ORDER_ID;
    
    /** 核销销售店代码 */
    @XmlElement(required = true)
    private String DEALER_CODE;
    
    /** 读取状态 */
    @XmlElement(required = true)
    private int Read_Flag;
    
    /** 优惠券简介 */
    @XmlElement(required = true)
    private String COUPON_INTRODUCTION;
    
    /** 第三方优惠券URL */
    @XmlElement(required = true)
    private String THIRD_PARTY_URL;
    
    /** 第三方券号 */
    @XmlElement(required = true)
    private String THIRD_PARTY_ID;
//
//    /** 优惠券URL */
//    @XmlElement(required = true)
//    private String COUPON_URL;
//    
//    public String getCOUPON_URL() {
//		return COUPON_URL;
//	}
//
//	public void setCOUPON_URL(String CouponUrl) {
//		COUPON_URL = CouponUrl;
//	}
    
    /** 优惠券密码 */
    @XmlElement(required = true)
    private String COUPON_PWD;
//    /** 优惠券密码标识 */
//    @XmlElement(required = true)
//    private int COUPON_PWD_FLG;
    /** 优惠券电话号码 */
    @XmlElement(required = true)
    private String COUPON_PHONE;
//    /** 优惠券电话号码标识 */
//    @XmlElement(required = true)
//    private int COUPON_PHONE_FLG;
//    /** 优惠券URL标识 */
//    @XmlElement(required = true)
//    private int COUPON_URL_FLG;
    
	public String getCOUPON_ID() {
		return COUPON_ID;
	}

	public void setCOUPON_ID(String cpuponID) {
		COUPON_ID = cpuponID;
	}

	public String getBATCH_ID() {
		return BATCH_ID;
	}

	public void setBATCH_ID(String bATCH_ID) {
		BATCH_ID = bATCH_ID;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String phone) {
		PHONE = phone;
	}

	public int getBC_ID() {
		return BC_ID;
	}

	public void setBC_ID(int bC_ID) {
		BC_ID = bC_ID;
	}
	
	public int getTC_ID() {
		return TC_ID;
	}

	public void setTC_ID(int tC_ID) {
		TC_ID = tC_ID;
	}
	
	public String getCOUPON_NAME() {
		return COUPON_NAME;
	}

	public void setCOUPON_NAME(String cOUPON_NAME) {
		COUPON_NAME = cOUPON_NAME;
	}

	public String getCOUPON_REMARK() {
		return COUPON_REMARK;
	}

	public void setCOUPON_REMARK(String cOUPON_REMARK) {
		COUPON_REMARK = cOUPON_REMARK;
	}
	
	public String getCOPYRIGHT() {
		return COPYRIGHT;
	}

	public void setCOPYRIGHT(String cOPYRIGHT) {
		COPYRIGHT = cOPYRIGHT;
	}
	
	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}
	
	public int getGRANT_TYPE() {
		return GRANT_TYPE;
	}

	public void setGRANT_TYPE(int gRANT_TYPE) {
		GRANT_TYPE = gRANT_TYPE;
	}
	
	public int getCOUPON_COST() {
		return COUPON_COST;
	}

	public void setCOUPON_COST(int cOUPON_COST) {
		COUPON_COST = cOUPON_COST;
	}
	
	public double getCOUPON_COUNT() {
		return COUPON_COUNT;
	}

	public void setCOUPON_COUNT(double cOUPON_COUNT) {
		COUPON_COUNT = cOUPON_COUNT;
	}
	
	public double getCOUPON_AMOUNT() {
		return COUPON_AMOUNT;
	}

	public void setCOUPON_AMOUNT(double cOUPON_AMOUNT) {
		COUPON_AMOUNT = cOUPON_AMOUNT;
	}
	
	public String getCOUPON_ISSUER() {
		return COUPON_ISSUER;
	}

	public void setCOUPON_ISSUER(String cOUPON_ISSUER) {
		COUPON_ISSUER = cOUPON_ISSUER;
	}
	
	public int getFROM_APPLICATION() {
		return FROM_APPLICATION;
	}

	public void setFROM_APPLICATION(int fROM_APPLICATION) {
		FROM_APPLICATION = fROM_APPLICATION;
	}
	
	public String getCONPON_USE_REMARK() {
		return CONPON_USE_REMARK;
	}

	public void setCONPON_USE_REMARK(String cONPON_USE_REMARK) {
		CONPON_USE_REMARK = cONPON_USE_REMARK;
	}
	
	public int getCOUPON_TYPE() {
		return COUPON_TYPE;
	}

	public void setCOUPON_TYPE(int cOUPON_TYPE) {
		COUPON_TYPE = cOUPON_TYPE;
	}
	
	public String getCOUPON_BEGIN() {
		return COUPON_BEGIN;
	}

	public void setCOUPON_BEGIN(String cOUPON_BEGIN) {
		COUPON_BEGIN = cOUPON_BEGIN;
	}
	
	public String getCOUPON_END() {
		return COUPON_END;
	}

	public void setCOUPON_END(String cOUPON_END) {
		COUPON_END = cOUPON_END;
	}
	
	public int getCOUPON_STATUS() {
		return COUPON_STATUS;
	}

	public void setCOUPON_STATUS(int cOUPON_STATUS) {
		COUPON_STATUS = cOUPON_STATUS;
	}
	
	public String getPUBLISH_DATE() {
		return PUBLISH_DATE;
	}

	public void setPUBLISH_DATE(String pUBLISH_DATE) {
		PUBLISH_DATE = pUBLISH_DATE;
	}
	
	public String getUSEING_DATE() {
		return USEING_DATE;
	}

	public void setUSEING_DATE(String uSEING_DATE) {
		USEING_DATE = uSEING_DATE;
	}
	
	public String getUSEED_DATE() {
		return USEED_DATE;
	}

	public void setUSEED_DATE(String uSEED_DATE) {
		USEED_DATE = uSEED_DATE;
	}
	
	public String getORDER_ID() {
		return ORDER_ID;
	}

	public void setORDER_ID(String oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}
	
	public String getDEALER_CODE() {
		return DEALER_CODE;
	}

	public void setDEALER_CODE(String dEALER_CODE) {
		DEALER_CODE = dEALER_CODE;
	}
	
	public int getRead_Flag() {
		return Read_Flag;
	}

	public void setRead_Flag(int read_Flag) {
		Read_Flag = read_Flag;
	}

	public void setCOUPON_INTRODUCTION(String cOUPON_INTRODUCTION) {
		COUPON_INTRODUCTION = cOUPON_INTRODUCTION;
	}

	public String getCOUPON_INTRODUCTION() {
		return COUPON_INTRODUCTION;
	}
	
	public void setTHIRD_PARTY_URL(String tHIRD_PARTY_URL) {
		THIRD_PARTY_URL = tHIRD_PARTY_URL;
	}

	public String getTHIRD_PARTY_URL() {
		return THIRD_PARTY_URL;
	}
	
	public void setTHIRD_PARTY_ID(String tHIRD_PARTY_ID) {
		THIRD_PARTY_ID = tHIRD_PARTY_ID;
	}

	public String getTHIRD_PARTY_ID() {
		return THIRD_PARTY_ID;
	}

    public String getCOUPON_PWD() {
        return COUPON_PWD;
    }

    public void setCOUPON_PWD(String cOUPON_PWD) {
        COUPON_PWD = cOUPON_PWD;
    }

//    public int getCOUPON_PWD_FLG() {
//        return COUPON_PWD_FLG;
//    }
//
//    public void setCOUPON_PWD_FLG(int cOUPON_PWD_FLG) {
//        COUPON_PWD_FLG = cOUPON_PWD_FLG;
//    }

//    public int getCOUPON_PHONE_FLG() {
//        return COUPON_PHONE_FLG;
//    }
//
//    public void setCOUPON_PHONE_FLG(int cOUPON_PHONE_FLG) {
//        COUPON_PHONE_FLG = cOUPON_PHONE_FLG;
//    }
//
//    public int getCOUPON_URL_FLG() {
//        return COUPON_URL_FLG;
//    }
//
//    public void setCOUPON_URL_FLG(int cOUPON_URL_FLG) {
//        COUPON_URL_FLG = cOUPON_URL_FLG;
//    }
    public String getCOUPON_PHONE() {
    	return COUPON_PHONE;
    }
    
    public void setCOUPON_PHONE(String cOUPON_PHONE) {
    	COUPON_PHONE = cOUPON_PHONE;
    }
}
