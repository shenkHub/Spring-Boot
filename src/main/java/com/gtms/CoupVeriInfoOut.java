
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupVeriInfoOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡcouponStatus���Ե�ֵ��
     * 
     */
    public int getCouponStatus() {
        return couponStatus;
    }

    /**
     * ����couponStatus���Ե�ֵ��
     * 
     */
    public void setCouponStatus(int value) {
        this.couponStatus = value;
    }

    /**
     * ��ȡcouponType���Ե�ֵ��
     * 
     */
    public int getCouponType() {
        return couponType;
    }

    /**
     * ����couponType���Ե�ֵ��
     * 
     */
    public void setCouponType(int value) {
        this.couponType = value;
    }

    /**
     * ��ȡcouponContent���Ե�ֵ��
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
     * ����couponContent���Ե�ֵ��
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
     * ��ȡcouponRule���Ե�ֵ��
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
     * ����couponRule���Ե�ֵ��
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
     * ��ȡcouponBegin���Ե�ֵ��
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
     * ����couponBegin���Ե�ֵ��
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
     * ��ȡcouponEnd���Ե�ֵ��
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
     * ����couponEnd���Ե�ֵ��
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
     * ��ȡbreakRuleContent���Ե�ֵ��
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
     * ����breakRuleContent���Ե�ֵ��
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
