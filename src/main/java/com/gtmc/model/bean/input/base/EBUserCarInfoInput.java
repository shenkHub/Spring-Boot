package com.gtmc.model.bean.input.base;

import com.gtmc.base.bean.input.BaseInputInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 账户车辆信息Input
 * 
 * @author wang
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EBUserCarInfoInput extends BaseInputInfo {
	/** serialVersion */
	private static final long serialVersionUID = 1L;

	//delete 20170920 start
	/** 所属系统CD */
	/*@XmlElement(required = true)
    private String sysCd;*/
	//delete 20170920 start

	/** 统合管理ID */
	@XmlElement(required = true)
	private String userId;

	//delete 20170920 start
	//	public String getSysCd() {
	//		return sysCd;
	//	}
	//
	//	public void setSysCd(String sysCd) {
	//		this.sysCd = sysCd;
	//	}
	//delete 20170920 end

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
}
