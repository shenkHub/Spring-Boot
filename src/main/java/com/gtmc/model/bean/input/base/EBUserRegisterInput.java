package com.gtmc.model.bean.input.base;

import com.gtmc.base.bean.input.BaseInputInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 用户注册Input
 * 
 * @author common
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class EBUserRegisterInput extends BaseInputInfo {
    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /**  */
    @XmlElement(required = true)
    private String SYS_CD;

	/** 增量时间戳 */
    @XmlElement(required = true)
    private String TEL_NO;
    
    /** 增量时间戳 */
    @XmlElement(required = true)
    private String PASSWORD;
    
    /** 增量时间戳 */
    @XmlElement(required = true)
    private String RECOMMENDED_NAME;
    
    /** 增量时间戳 */
    @XmlElement(required = true)
    private String REGIST_FROM_TYPE;
    
    /** 增量时间戳 */
    @XmlElement(required = true)
    private String REGIST_FROM_CD;
    
    /** 处理区分 0：注册 1：修改密码 */
    @XmlElement(required = true)
    private int PROCESS_KBN;
    
	public String getSYS_CD() {
		return SYS_CD;
	}

	public void setSYS_CD(String sYS_CD) {
		SYS_CD = sYS_CD;
	}

	public String getTEL_NO() {
		return TEL_NO;
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

	public String getRECOMMENDED_NAME() {
		return RECOMMENDED_NAME;
	}

	public void setRECOMMENDED_NAME(String rECOMMENDED_NAME) {
		RECOMMENDED_NAME = rECOMMENDED_NAME;
	}

	public String getREGIST_FROM_TYPE() {
		return REGIST_FROM_TYPE;
	}

	public void setREGIST_FROM_TYPE(String rEGIST_FROM_TYPE) {
		REGIST_FROM_TYPE = rEGIST_FROM_TYPE;
	}

	public String getREGIST_FROM_CD() {
		return REGIST_FROM_CD;
	}

	public void setREGIST_FROM_CD(String rEGIST_FROM_CD) {
		REGIST_FROM_CD = rEGIST_FROM_CD;
	}

    /**
     * @return the pROCESS_KBN
     */
    public int getPROCESS_KBN() {
        return PROCESS_KBN;
    }

    /**
     * @param pROCESS_KBN the pROCESS_KBN to set
     */
    public void setPROCESS_KBN(int pROCESS_KBN) {
        PROCESS_KBN = pROCESS_KBN;
    }

}
