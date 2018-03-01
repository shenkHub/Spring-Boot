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
public class AppVehicleUserInfoByTelInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    /** 客户手机号 */
    @XmlElement(required = true)
    private String phone;
    /** 密码 */
    private String password;
    /** 姓名 */
    private String name;
    /** 性别 */
    private String sex;
    /** 生日(年)*/
    private String birthday_year;
    /** 生日(月)*/
    private String birthday_month;
    /** 生日(日)*/
    private String birthday_day;
    /** 头像-APP*/
    private String avatar_img_gclub;
    /** 头像-iClub*/
    private String avatar_img_iclub;
    /** 地址-省*/
    private String address_province;
    /** 地址-市*/
    private String address_city;
    /** 详细地址*/
    private String address_detail;
    /** 绑定DLR*/
    private String dealer_code;
    /** 驾照到期时间*/
    private String driving_license_expiry_date;
    /**APIREGISTER*/
    private String apiRegister;
    /** 注册日时-APP*/
    private String regist_date_gclub;
    /** 注册日时-iClub*/
    private String regist_date_iclub;
    /** 微信号*/
    private String wx_code;
    /** 昵称*/
    private String nickName;
    /** 用户类别*/
    private String user_type;
    /** 身份证号*/
    private String identity_card;
    /** 推荐人姓名*/
    private String recommended_name;
    /** 推荐源渠道区分*/
    private String regist_from_type;
    /** 推荐源CD*/
    private String regist_from_cd;
    /** 状态*/
    private String status;
    /** 登陆次数-iClub*/
    private String login_count_iclub;
    /** 最新Login日时-iClub*/
    private String last_login_date_iclub;
    /** 登录失败计数器-iClub*/
    private String login_fail_count_iclub;
    /** 登陆次数-APP*/
    private String login_count_gclub;
    /** 最新Login日时-APP*/
    private String last_login_date_gclub;
    /** 约束状态-APP*/
    private String login_fail_count_gclub;
    /** 设备id*/
    private String device_id;
    /** APP版本*/
    private String app_version;
    /** APP系统类别*/
    private String app_os_type;
    //Add for APP车主信息同步至EIP jiao_jianying 20161228 start
    /** 激活Flag*/
    private String activeFlag;
    //Add for APP车主信息同步至EIP jiao_jianying 20161228 end
    /**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the birthday_year
	 */
	public String getBirthday_year() {
		return birthday_year;
	}
	/**
	 * @param birthday_year the birthday_year to set
	 */
	public void setBirthday_year(String birthday_year) {
		this.birthday_year = birthday_year;
	}
	/**
	 * @return the birthday_month
	 */
	public String getBirthday_month() {
		return birthday_month;
	}
	/**
	 * @param birthday_month the birthday_month to set
	 */
	public void setBirthday_month(String birthday_month) {
		this.birthday_month = birthday_month;
	}
	/**
	 * @return the birthday_day
	 */
	public String getBirthday_day() {
		return birthday_day;
	}
	/**
	 * @param birthday_day the birthday_day to set
	 */
	public void setBirthday_day(String birthday_day) {
		this.birthday_day = birthday_day;
	}
	/**
	 * @return the avatar_img_gclub
	 */
	public String getAvatar_img_gclub() {
		return avatar_img_gclub;
	}
	/**
	 * @param avatar_img_gclub the avatar_img_gclub to set
	 */
	public void setAvatar_img_gclub(String avatar_img_gclub) {
		this.avatar_img_gclub = avatar_img_gclub;
	}
	/**
	 * @return the avatar_img_iclub
	 */
	public String getAvatar_img_iclub() {
		return avatar_img_iclub;
	}
	/**
	 * @param avatar_img_iclub the avatar_img_iclub to set
	 */
	public void setAvatar_img_iclub(String avatar_img_iclub) {
		this.avatar_img_iclub = avatar_img_iclub;
	}
	/**
	 * @return the address_province
	 */
	public String getAddress_province() {
		return address_province;
	}
	/**
	 * @param address_province the address_province to set
	 */
	public void setAddress_province(String address_province) {
		this.address_province = address_province;
	}
	/**
	 * @return the address_city
	 */
	public String getAddress_city() {
		return address_city;
	}
	/**
	 * @param address_city the address_city to set
	 */
	public void setAddress_city(String address_city) {
		this.address_city = address_city;
	}
	/**
	 * @return the address_detail
	 */
	public String getAddress_detail() {
		return address_detail;
	}
	/**
	 * @param address_detail the address_detail to set
	 */
	public void setAddress_detail(String address_detail) {
		this.address_detail = address_detail;
	}
	/**
	 * @return the dealer_code
	 */
	public String getDealer_code() {
		return dealer_code;
	}
	/**
	 * @param dealer_code the dealer_code to set
	 */
	public void setDealer_code(String dealer_code) {
		this.dealer_code = dealer_code;
	}
	/**
	 * @return the driving_license_expiry_date
	 */
	public String getDriving_license_expiry_date() {
		return driving_license_expiry_date;
	}
	/**
	 * @param driving_license_expiry_date the driving_license_expiry_date to set
	 */
	public void setDriving_license_expiry_date(String driving_license_expiry_date) {
		this.driving_license_expiry_date = driving_license_expiry_date;
	}
	/**
	 * @return the apiRegister
	 */
	public String getApiRegister() {
		return apiRegister;
	}
	/**
	 * @param apiRegister the apiRegister to set
	 */
	public void setApiRegister(String apiRegister) {
		this.apiRegister = apiRegister;
	}
	/**
	 * @return the regist_date_gclub
	 */
	public String getRegist_date_gclub() {
		return regist_date_gclub;
	}
	/**
	 * @param regist_date_gclub the regist_date_gclub to set
	 */
	public void setRegist_date_gclub(String regist_date_gclub) {
		this.regist_date_gclub = regist_date_gclub;
	}
	/**
	 * @return the regist_date_iclub
	 */
	public String getRegist_date_iclub() {
		return regist_date_iclub;
	}
	/**
	 * @param regist_date_iclub the regist_date_iclub to set
	 */
	public void setRegist_date_iclub(String regist_date_iclub) {
		this.regist_date_iclub = regist_date_iclub;
	}
	/**
	 * @return the wx_code
	 */
	public String getWx_code() {
		return wx_code;
	}
	/**
	 * @param wx_code the wx_code to set
	 */
	public void setWx_code(String wx_code) {
		this.wx_code = wx_code;
	}
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * @return the user_type
	 */
	public String getUser_type() {
		return user_type;
	}
	/**
	 * @param user_type the user_type to set
	 */
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	/**
	 * @return the identity_card
	 */
	public String getIdentity_card() {
		return identity_card;
	}
	/**
	 * @param identity_card the identity_card to set
	 */
	public void setIdentity_card(String identity_card) {
		this.identity_card = identity_card;
	}
	/**
	 * @return the recommended_name
	 */
	public String getRecommended_name() {
		return recommended_name;
	}
	/**
	 * @param recommended_name the recommended_name to set
	 */
	public void setRecommended_name(String recommended_name) {
		this.recommended_name = recommended_name;
	}
	/**
	 * @return the regist_from_type
	 */
	public String getRegist_from_type() {
		return regist_from_type;
	}
	/**
	 * @param regist_from_type the regist_from_type to set
	 */
	public void setRegist_from_type(String regist_from_type) {
		this.regist_from_type = regist_from_type;
	}
	/**
	 * @return the regist_from_cd
	 */
	public String getRegist_from_cd() {
		return regist_from_cd;
	}
	/**
	 * @param regist_from_cd the regist_from_cd to set
	 */
	public void setRegist_from_cd(String regist_from_cd) {
		this.regist_from_cd = regist_from_cd;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the login_count_iclub
	 */
	public String getLogin_count_iclub() {
		return login_count_iclub;
	}
	/**
	 * @param login_count_iclub the login_count_iclub to set
	 */
	public void setLogin_count_iclub(String login_count_iclub) {
		this.login_count_iclub = login_count_iclub;
	}
	/**
	 * @return the last_login_date_iclub
	 */
	public String getLast_login_date_iclub() {
		return last_login_date_iclub;
	}
	/**
	 * @param last_login_date_iclub the last_login_date_iclub to set
	 */
	public void setLast_login_date_iclub(String last_login_date_iclub) {
		this.last_login_date_iclub = last_login_date_iclub;
	}
	/**
	 * @return the login_fail_count_iclub
	 */
	public String getLogin_fail_count_iclub() {
		return login_fail_count_iclub;
	}
	/**
	 * @param login_fail_count_iclub the login_fail_count_iclub to set
	 */
	public void setLogin_fail_count_iclub(String login_fail_count_iclub) {
		this.login_fail_count_iclub = login_fail_count_iclub;
	}
	/**
	 * @return the login_count_gclub
	 */
	public String getLogin_count_gclub() {
		return login_count_gclub;
	}
	/**
	 * @param login_count_gclub the login_count_gclub to set
	 */
	public void setLogin_count_gclub(String login_count_gclub) {
		this.login_count_gclub = login_count_gclub;
	}
	/**
	 * @return the last_login_date_gclub
	 */
	public String getLast_login_date_gclub() {
		return last_login_date_gclub;
	}
	/**
	 * @param last_login_date_gclub the last_login_date_gclub to set
	 */
	public void setLast_login_date_gclub(String last_login_date_gclub) {
		this.last_login_date_gclub = last_login_date_gclub;
	}
	/**
	 * @return the login_fail_count_gclub
	 */
	public String getLogin_fail_count_gclub() {
		return login_fail_count_gclub;
	}
	/**
	 * @param login_fail_count_gclub the login_fail_count_gclub to set
	 */
	public void setLogin_fail_count_gclub(String login_fail_count_gclub) {
		this.login_fail_count_gclub = login_fail_count_gclub;
	}
	/**
	 * @return the device_id
	 */
	public String getDevice_id() {
		return device_id;
	}
	/**
	 * @param device_id the device_id to set
	 */
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	/**
	 * @return the app_version
	 */
	public String getApp_version() {
		return app_version;
	}
	/**
	 * @param app_version the app_version to set
	 */
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	/**
	 * @return the app_os_type
	 */
	public String getApp_os_type() {
		return app_os_type;
	}
	/**
	 * @param app_os_type the app_os_type to set
	 */
	public void setApp_os_type(String app_os_type) {
		this.app_os_type = app_os_type;
	}
	
    public String getActiveFlag() {
        return activeFlag;
    }
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }
	
    
}
