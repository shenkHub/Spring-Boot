/**
 * 
 */
package com.gtmc.model.bean.input.coupon;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.input.BaseInputInfo;

/**
 * @author Hoperun
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class NewHLDerCouponInput extends BaseInputInfo {

    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /** 用户手机号 */
    @XmlElement(required = true)
    private String telNo;

    /** 领取车架号 */
    @XmlElement(required = true)
    private List<String> vinNoList = new ArrayList<>();

    /**
     * @return the telNo
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param telNo
     *            the telNo to set
     */
    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    /**
     * @return the vinNoList
     */
    public List<String> getVinNoList() {
        return vinNoList;
    }

    /**
     * @param vinNoList
     *            the vinNoList to set
     */
    public void setVinNoList(List<String> vinNoList) {
        this.vinNoList = vinNoList;
    }

}
