package com.gtmc.model.bean.input.base;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

public class EBUserPointHisInfoInput extends BaseInputInfo {
	
	 /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /**统合管理ID  */
    @XmlElement(required = true)
    private String USER_ID;
    
    /**积分失效计算对象Flg  */
    @XmlElement(required = true)
    private String POINT_EXPIRED_COUNT_TARGET;
    
    /**积分失效计算状态CD  */
    @XmlElement(required = true)
    private String POINT_EXPIRED_COUNT_STATE;
    
    /**积分反映成功  */
    @XmlElement(required = true)
    private String POINT_CHG_RESULT;
    
    /**查询开始时间  */
    @XmlElement(required = true)
    private String DATE_FROM;
    
    /**查询终止时间  */
    @XmlElement(required = true)
    private String DATE_TO;

	public String getUSER_ID() {
		return USER_ID;
	}

	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}

	public String getPOINT_EXPIRED_COUNT_TARGET() {
		return POINT_EXPIRED_COUNT_TARGET;
	}

	public void setPOINT_EXPIRED_COUNT_TARGET(String pOINT_EXPIRED_COUNT_TARGET) {
		POINT_EXPIRED_COUNT_TARGET = pOINT_EXPIRED_COUNT_TARGET;
	}

	public String getPOINT_EXPIRED_COUNT_STATE() {
		return POINT_EXPIRED_COUNT_STATE;
	}

	public void setPOINT_EXPIRED_COUNT_STATE(String pOINT_EXPIRED_COUNT_STATE) {
		POINT_EXPIRED_COUNT_STATE = pOINT_EXPIRED_COUNT_STATE;
	}

	public String getPOINT_CHG_RESULT() {
		return POINT_CHG_RESULT;
	}

	public void setPOINT_CHG_RESULT(String pOINT_CHG_RESULT) {
		POINT_CHG_RESULT = pOINT_CHG_RESULT;
	}

	public String getDATE_FROM() {
		return DATE_FROM;
	}

	public void setDATE_FROM(String dATE_FROM) {
		DATE_FROM = dATE_FROM;
	}

	public String getDATE_TO() {
		return DATE_TO;
	}

	public void setDATE_TO(String dATE_TO) {
		DATE_TO = dATE_TO;
	}
}
