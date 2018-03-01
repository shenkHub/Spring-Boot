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
public class EBUserLoginInput extends BaseInputInfo {
    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /**所属系统CD  */
    @XmlElement(required = true)
    private String SYS_CD;

	/** 手机号码 */
    @XmlElement(required = true)
    private String TEL_NO;
    
    /** 密码 */
    @XmlElement(required = true)
    private String PASSWORD;
    
    /**激活Flg */
    @XmlElement(required = true)
    private String ACTIVATE_FLG;

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

	public String getACTIVATE_FLG() {
		return ACTIVATE_FLG;
	}

	public void setACTIVATE_FLG(String aCTIVATE_FLG) {
		ACTIVATE_FLG = aCTIVATE_FLG;
	}
}
