package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * APP透明车间车型视频播放Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AppCarVideoUrlInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 协议书号 */
    @XmlElement(required = true)
    private String contractNo;

    /** 销售店代码 */
    @XmlElement(required = true)
    private String dealerCode;

    /** 用户ID */
    @XmlElement(required = true)
    private String userId;
    
   
	/**
	 * @return the contractNo
	 */
	public String getContractNo() {
		return contractNo;
	}

	/**
	 * @param password the contractNo to set
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	/**
	 * @return the dealerCode
	 */
	public String getDealerCode() {
		return dealerCode;
	}

	/**
	 * @param password the dealerCode to set
	 */
	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param password the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
