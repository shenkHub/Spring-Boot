package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * APP车主信息Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AppUserInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 客户ID */
    @XmlElement(required = true)
    private String userId;

    /** 客户手机号 */
    @XmlElement(required = true)
    private String phone;

    /** 姓名 */
    private String userName;
    
    /** 驾驶证到期日 */
    private String driverDate;
    
    /** 住址 */
    private String address;
    
    /**
     * 客户ID取得
     * 
     * @return 客户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 客户ID设定
     * 
     * @param userId 客户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
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
     * 姓名取得
     * 
     * @return 姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 姓名设定
     * 
     * @param userName 姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 驾驶证到期日取得
     * 
     * @return 驾驶证到期日
     */
    public String getDriverDate() {
        return driverDate;
    }

    /**
     * 驾驶证到期日设定
     * 
     * @param driverDate 驾驶证到期日
     */
    public void setDriverDate(String driverDate) {
        this.driverDate = driverDate;
    }
    
    /**
     * 住址取得
     * 
     * @return 住址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 住址设定
     * 
     * @param address 住址
     */
    public void setAddress(String address) {
        this.address = address;
    }
}
