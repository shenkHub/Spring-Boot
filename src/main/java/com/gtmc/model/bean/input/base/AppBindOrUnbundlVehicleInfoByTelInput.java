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
public class AppBindOrUnbundlVehicleInfoByTelInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 客户手机号 */
    @XmlElement(required = true)
    private String phone;

    /** 车架号 */
    @XmlElement(required = true)
    private String vin;

    /** 动作类型 */
    @XmlElement(required = true)
    private String type;

    

    /**
     * 客户手机号取得
     * 
     * @return 客户手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 客户手机号设定
     * 
     * @param phone 客户手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
