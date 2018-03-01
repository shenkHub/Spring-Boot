package com.gtmc.model.bean.input.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

@XmlAccessorType(XmlAccessType.FIELD)
public class RemoveUserInfoByTelInput extends BaseInputInfo{
	private static final long serialVersionUID = 1L;
	/**
	 * 用户电话
	 */
	@XmlElement(required = true)
	private String tel_no;

	public String getTel_no() {
		return tel_no;
	}

	/**
	 * @param tel_no
	 */
	public void setTel_no(String tel_no) {
		this.tel_no = tel_no;
	}

	
}
