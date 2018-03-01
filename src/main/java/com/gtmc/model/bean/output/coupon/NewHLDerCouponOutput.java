package com.gtmc.model.bean.output.coupon;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.gtmc.base.bean.output.BaseOutputInfo;

@XmlAccessorType(XmlAccessType.FIELD)
public class NewHLDerCouponOutput extends BaseOutputInfo {
    /** serialVersion */
    private static final long serialVersionUID = 1L;

    /**
     * 领取结果
     */
    private int result;

    /** 车架号LIST */
    @XmlElement(required = true)
    private List<String> vinNoList;

    /** 优惠券码 */
    @XmlElement(required = true)
    private List<String> couponIdList;

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

    /**
     * @param result
     *            the result to set
     */
    public void setResult(int result) {
        this.result = result;
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

    /**
     * @return the couponIdList
     */
    public List<String> getCouponIdList() {
        return couponIdList;
    }

    /**
     * @param couponIdList
     *            the couponIdList to set
     */
    public void setCouponIdList(List<String> couponIdList) {
        this.couponIdList = couponIdList;
    }

}
