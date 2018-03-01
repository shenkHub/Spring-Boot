package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * @ClassName: GetIClubUserId
 * @Description: 根据统合管理ID取得会员ID
 * @author 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class GetUserIDFromUUIDInput extends BaseInputInfo {
    /**
     * @Fields serialVersionUID : 序列码
     */
    private static final long serialVersionUID = 1L;

    /**
     * @Fields  统合管理ID
     */
    @XmlElement(required = true)
    private String uidGtmc;
    
    /**
     * @Fields  系统所属CD
     */
    @XmlElement(required = true)
    private String sysCd;

	

	/**
	 * @return the uidGtmc
	 */
	public String getUidGtmc() {
		return uidGtmc;
	}

	/**
	 * @param uidGtmc the uidGtmc to set
	 */
	public void setUidGtmc(String uidGtmc) {
		this.uidGtmc = uidGtmc;
	}

	/**
	 * @return the sysCd
	 */
	public String getSysCd() {
		return sysCd;
	}

	/**
	 * @param sysCd the sysCd to set
	 */
	public void setSysCd(String sysCd) {
		this.sysCd = sysCd;
	}

}
