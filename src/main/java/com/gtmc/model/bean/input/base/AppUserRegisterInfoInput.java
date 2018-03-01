package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * APP注册信息Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class AppUserRegisterInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /** 所属系统CD */
    @XmlElement(required = true)
    private String sys_cd;

    /** 手机号码 */
    @XmlElement(required = true)
    private String tel_no;

    /** 密码 */
    @XmlElement(required = true)
    private String password;
    
    /** 用户ID */
    @XmlElement(required = true)
    private String uid;

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
	 * @return the tel_no
	 */
	public String getTel_no() {
		return tel_no;
	}

	/**
	 * @param tel_no the tel_no to set
	 */
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
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
    
    
}
