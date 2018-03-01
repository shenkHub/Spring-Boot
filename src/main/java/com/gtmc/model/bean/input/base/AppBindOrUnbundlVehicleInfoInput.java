package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * APP车辆绑定/解绑接口Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AppBindOrUnbundlVehicleInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 所属系统CD */
    @XmlElement(required = true)
    private String sys_cd;
    
    /** 用户ID */
    @XmlElement(required = true)
    private String uid;

    /** 车架号 */
    @XmlElement(required = true)
    private String vin;

    /** 动作类型 */
    @XmlElement(required = true)
    private String type;

    

	/**
	 * @return the sys_cd
	 */
	public String getSys_cd() {
		return sys_cd;
	}
	/**
	 * @param sys_cd the sys_cd to set
	 */
	public void setSys_cd(String sys_cd) {
		this.sys_cd = sys_cd;
	}
	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}
	/**
	 * @return the vin
	 */
	public String getVin() {
		return vin;
	}
	/**
	 * @param vin the vin to set
	 */
	public void setVin(String vin) {
		this.vin = vin;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
}
