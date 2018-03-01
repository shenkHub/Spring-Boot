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
public class EBUserInfoInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;
    
    /**所属系统CD  */
    @XmlElement(required = true)
    private String SYS_CD;
    
    /** 统合管理ID */
    @XmlElement(required = true)
    private String UID;

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
}
