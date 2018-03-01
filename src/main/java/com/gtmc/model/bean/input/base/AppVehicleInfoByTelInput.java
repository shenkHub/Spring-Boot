package com.gtmc.model.bean.input.base;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * APP车辆信息Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AppVehicleInfoByTelInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 客户手机号 */
    @XmlElement(required = true)
    private String phone;

    /** VIN */
    @XmlElement(required = true)
    private String vin;
    
    /** 车牌号 */
    private String licenseNo;
    
    /** 行驶证检验有效期 */
    private String vehicleDate;
    
    /** 保养提醒设置 */
    private String maintainSet;
    
    /** 保险公司 */
    private String insurer;
    
    /** 保险生效日 */
    private String insuranceEffectiveDate;		

    /** 车辆昵称 */
    private String car_nickName;
    /** 保险开始日时 */
    private String insurance_start_date ;
    /** 保险结束日时 */
    private String insurance_end_date;
    /** 年审日期 */
    private String examine_date;
    /** 手动更新里程 */
    private String mileage_user_set;			

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
	 * @return the car_nickName
	 */
	public String getCar_nickName() {
		return car_nickName;
	}

	/**
	 * @param car_nickName the car_nickName to set
	 */
	public void setCar_nickName(String car_nickName) {
		this.car_nickName = car_nickName;
	}

	/**
	 * @return the insurance_start_date
	 */
	public String getInsurance_start_date() {
		return insurance_start_date;
	}

	/**
	 * @param insurance_start_date the insurance_start_date to set
	 */
	public void setInsurance_start_date(String insurance_start_date) {
		this.insurance_start_date = insurance_start_date;
	}

	/**
	 * @return the insurance_end_date
	 */
	public String getInsurance_end_date() {
		return insurance_end_date;
	}

	/**
	 * @param insurance_end_date the insurance_end_date to set
	 */
	public void setInsurance_end_date(String insurance_end_date) {
		this.insurance_end_date = insurance_end_date;
	}

	/**
	 * @return the examine_date
	 */
	public String getExamine_date() {
		return examine_date;
	}

	/**
	 * @param examine_date the examine_date to set
	 */
	public void setExamine_date(String examine_date) {
		this.examine_date = examine_date;
	}

	/**
	 * @return the mileage_user_set
	 */
	public String getMileage_user_set() {
		return mileage_user_set;
	}

	/**
	 * @param mileage_user_set the mileage_user_set to set
	 */
	public void setMileage_user_set(String mileage_user_set) {
		this.mileage_user_set = mileage_user_set;
	}
	//Add for:车主车辆信息保存/修改   xing_lili 20161008 end

    /**
     * VIN取得
     * 
     * @return VIN
     */
    public String getVin() {
        return vin;
    }

    /**
     * VIN设定
     * 
     * @param vin VIN
     */
    public void setVin(String vin) {
        this.vin = vin;
    }
    
    /**
     * 车牌号取得
     * 
     * @return 车牌号
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * 车牌号设定
     * 
     * @param licenseNo 车牌号
     */
    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
    
    /**
     * 行驶证检验有效期取得
     * 
     * @return 行驶证检验有效期
     */
    public String getVehicleDate() {
        return vehicleDate;
    }

    /**
     * 行驶证检验有效期设定
     * 
     * @param vehicleDate 行驶证检验有效期
     */
    public void setVehicleDate(String vehicleDate) {
        this.vehicleDate = vehicleDate;
    }
    
    /**
     * 保养提醒设置取得
	 * @return the maintainSet
	 */
	public String getMaintainSet() {
		return maintainSet;
	}

	/**
	 * 保养提醒设置取得
	 * @param maintainSet the maintainSet to set
	 */
	public void setMaintainSet(String maintainSet) {
		this.maintainSet = maintainSet;
	}

	/**
     * 保险公司取得
     * 
     * @return 保险公司
     */
    public String getInsurer() {
        return insurer;
    }

    /**
     * 保险公司设定
     * 
     * @param insurer 保险公司
     */
    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }
    

    /**
     * 保险生效日取得
     * 
     * @return 保险生效日
     */
    public String getInsuranceEffectiveDate() {
        return insuranceEffectiveDate;
    }

    /**
     * 保险生效日设定
     * 
     * @param insuranceEffectiveDate 保险生效日
     */
    public void setInsuranceEffectiveDate(String insuranceEffectiveDate) {
        this.insuranceEffectiveDate = insuranceEffectiveDate;
    }
    
    
}
