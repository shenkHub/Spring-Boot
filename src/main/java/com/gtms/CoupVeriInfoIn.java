
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupVeriInfoIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="coupVeriInfoIn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sfxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vinNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupVeriInfoIn", propOrder = {
    "couponId",
    "dealerCode",
    "sfxCode",
    "vinNo",
    "checkModel"
})
public class CoupVeriInfoIn
    extends BaseInputInfo
{

    @XmlElement(required = true)
    protected String couponId;
    @XmlElement(required = true)
    protected String dealerCode;
    @XmlElement(required = true)
    protected String sfxCode;
    @XmlElement(required = true)
    protected String vinNo;
    @XmlElement(required = true)
    protected String checkModel;

    /**
     * 获取couponId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * 设置couponId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponId(String value) {
        this.couponId = value;
    }

    /**
     * 获取dealerCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * 设置dealerCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * 获取sfxCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfxCode() {
        return sfxCode;
    }

    /**
     * 设置sfxCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfxCode(String value) {
        this.sfxCode = value;
    }

    /**
     * 获取vinNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinNo() {
        return vinNo;
    }

    /**
     * 设置vinNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinNo(String value) {
        this.vinNo = value;
    }

    /**
     * 获取checkModel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckModel() {
        return checkModel;
    }

    /**
     * 设置checkModel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckModel(String value) {
        this.checkModel = value;
    }

}
