package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * 电商会员信息更新Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EBUpdateUserInfoInput extends BaseInputInfo {

	/** serialVersion */
	private static final long serialVersionUID = 1L;

	/** 所属系统CD */
	@XmlElement(required = true)
	private String SYS_CD;

	/** 统合管理ID */
	@XmlElement(required = true)
	private String UID;

	/** 车架号 */
	@XmlElement(required = true)
	private String VINNO;

	/** 手机号码 */
	@XmlElement(required = true)
	private String TEL_NO;

	/* 密码 */
	@XmlElement(required = true)
	private String PASSWORD;

	/** 姓名 */
	@XmlElement(required = true)
	private String NAME;

	/** 性别 */
	@XmlElement(required = true)
	private String SEX;

	/** 生日(年) */
	@XmlElement(required = true)
	private String BIRTHDAY_YEAR;

	/** 生日(月) */
	@XmlElement(required = true)
	private String BIRTHDAY_MONTH;

	/** 生日(日) */
	@XmlElement(required = true)
	private String BIRTHDAY_DAY;

	/** 头像-iClub */
	@XmlElement(required = true)
	private String AVATAR_IMG_ICLUB;

	/** 地址-省 */
	@XmlElement(required = true)
	private String ADDRESS_PROVINCE;

	/** 地址-市 */
	@XmlElement(required = true)
	private String ADDRESS_CITY;

	/** 详细地址 */
	@XmlElement(required = true)
	private String ADDRESS_DETAIL;

	/** 驾照到期时间 */
	@XmlElement(required = true)
	private String DRIVING_LICENSE_EXPIRY_DATE;

	/** 昵称 */
	@XmlElement(required = true)
	private String NICKNAME;

	/** 车牌号码 */
	@XmlElement(required = true)
	private String REGISTERNO;

	/** 保险生效日 */
	@XmlElement(required = true)
	private String INSURANCE_EFFECTIVE_DATE;

	/** 行驶证检验有效期 */
	@XmlElement(required = true)
	private String VEHICLE_VALIDATE_DATE;

	public String getTEL_NO() {
		return TEL_NO;
	}

	public String getSYS_CD() {
		return SYS_CD;
	}

	public void setSYS_CD(String sYS_CD) {
		SYS_CD = sYS_CD;
	}

	public String getUID() {
		return UID;
	}

	public void setUID(String uID) {
		UID = uID;
	}

	public void setTEL_NO(String tEL_NO) {
		TEL_NO = tEL_NO;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getSEX() {
		return SEX;
	}

	public void setSEX(String sEX) {
		SEX = sEX;
	}

	public String getBIRTHDAY_YEAR() {
		return BIRTHDAY_YEAR;
	}

	public void setBIRTHDAY_YEAR(String bIRTHDAY_YEAR) {
		BIRTHDAY_YEAR = bIRTHDAY_YEAR;
	}

	public String getBIRTHDAY_MONTH() {
		return BIRTHDAY_MONTH;
	}

	public void setBIRTHDAY_MONTH(String bIRTHDAY_MONTH) {
		BIRTHDAY_MONTH = bIRTHDAY_MONTH;
	}

	public String getBIRTHDAY_DAY() {
		return BIRTHDAY_DAY;
	}

	public void setBIRTHDAY_DAY(String bIRTHDAY_DAY) {
		BIRTHDAY_DAY = bIRTHDAY_DAY;
	}

	public String getAVATAR_IMG_ICLUB() {
		return AVATAR_IMG_ICLUB;
	}

	public void setAVATAR_IMG_ICLUB(String aVATAR_IMG_ICLUB) {
		AVATAR_IMG_ICLUB = aVATAR_IMG_ICLUB;
	}

	public String getADDRESS_PROVINCE() {
		return ADDRESS_PROVINCE;
	}

	public void setADDRESS_PROVINCE(String aDDRESS_PROVINCE) {
		ADDRESS_PROVINCE = aDDRESS_PROVINCE;
	}

	public String getADDRESS_CITY() {
		return ADDRESS_CITY;
	}

	public void setADDRESS_CITY(String aDDRESS_CITY) {
		ADDRESS_CITY = aDDRESS_CITY;
	}

	public String getADDRESS_DETAIL() {
		return ADDRESS_DETAIL;
	}

	public void setADDRESS_DETAIL(String aDDRESS_DETAIL) {
		ADDRESS_DETAIL = aDDRESS_DETAIL;
	}

	public String getDRIVING_LICENSE_EXPIRY_DATE() {
		return DRIVING_LICENSE_EXPIRY_DATE;
	}

	public void setDRIVING_LICENSE_EXPIRY_DATE(String dRIVING_LICENSE_EXPIRY_DATE) {
		DRIVING_LICENSE_EXPIRY_DATE = dRIVING_LICENSE_EXPIRY_DATE;
	}

	public String getNICKNAME() {
		return NICKNAME;
	}

	public void setNICKNAME(String nICKNAME) {
		NICKNAME = nICKNAME;
	}

	public String getVINNO() {
		return VINNO;
	}

	public void setVINNO(String vINNO) {
		VINNO = vINNO;
	}

	public String getREGISTERNO() {
		return REGISTERNO;
	}

	public void setREGISTERNO(String rEGISTERNO) {
		REGISTERNO = rEGISTERNO;
	}

	public String getINSURANCE_EFFECTIVE_DATE() {
		return INSURANCE_EFFECTIVE_DATE;
	}

	public void setINSURANCE_EFFECTIVE_DATE(String iNSURANCE_EFFECTIVE_DATE) {
		INSURANCE_EFFECTIVE_DATE = iNSURANCE_EFFECTIVE_DATE;
	}

	public String getVEHICLE_VALIDATE_DATE() {
		return VEHICLE_VALIDATE_DATE;
	}

	public void setVEHICLE_VALIDATE_DATE(String vEHICLE_VALIDATE_DATE) {
		VEHICLE_VALIDATE_DATE = vEHICLE_VALIDATE_DATE;
	}

}
