
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupVeriInfoOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="coupVeriInfoOut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="couponStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="couponContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponRule" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponBegin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="couponEnd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="breakRuleContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupVeriInfoOut", propOrder = {
    "couponStatus",
    "couponType",
    "couponContent",
    "couponRule",
    "couponBegin",
    "couponEnd",
    "breakRuleContent"
})
public class CoupVeriInfoOut
    extends BaseOutputInfo
{

    protected int couponStatus;
    protected int couponType;
    @XmlElement(required = true)
    protected String couponContent;
    @XmlElement(required = true)
    protected String couponRule;
    @XmlElement(required = true)
    protected String couponBegin;
    @XmlElement(required = true)
    protected String couponEnd;
    @XmlElement(required = true)
    protected String breakRuleContent;

    /**
     * 获取couponStatus属性的值。
     * 
     */
    public int getCouponStatus() {
        return couponStatus;
    }

    /**
     * 设置couponStatus属性的值。
     * 
     */
    public void setCouponStatus(int value) {
        this.couponStatus = value;
    }

    /**
     * 获取couponType属性的值。
     * 
     */
    public int getCouponType() {
        return couponType;
    }

    /**
     * 设置couponType属性的值。
     * 
     */
    public void setCouponType(int value) {
        this.couponType = value;
    }

    /**
     * 获取couponContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponContent() {
        return couponContent;
    }

    /**
     * 设置couponContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponContent(String value) {
        this.couponContent = value;
    }

    /**
     * 获取couponRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponRule() {
        return couponRule;
    }

    /**
     * 设置couponRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponRule(String value) {
        this.couponRule = value;
    }

    /**
     * 获取couponBegin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponBegin() {
        return couponBegin;
    }

    /**
     * 设置couponBegin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponBegin(String value) {
        this.couponBegin = value;
    }

    /**
     * 获取couponEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponEnd() {
        return couponEnd;
    }

    /**
     * 设置couponEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponEnd(String value) {
        this.couponEnd = value;
    }

    /**
     * 获取breakRuleContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakRuleContent() {
        return breakRuleContent;
    }

    /**
     * 设置breakRuleContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakRuleContent(String value) {
        this.breakRuleContent = value;
    }

}
