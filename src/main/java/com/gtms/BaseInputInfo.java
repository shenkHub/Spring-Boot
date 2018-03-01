
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>baseInputInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="baseInputInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromSystemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toSystemCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messagId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseInputInfo", propOrder = {
    "fromSystemCode",
    "toSystemCode",
    "messagId"
})
@XmlSeeAlso({
    MemberPhoneValidateInfoInput.class,
    CoupBindIn.class,
    CoupVeriInfoIn.class,
    CouponWOffIn.class,
    GetMsgContentInput.class
})
public class BaseInputInfo {

    @XmlElement(required = true)
    protected String fromSystemCode;
    @XmlElement(required = true)
    protected String toSystemCode;
    @XmlElement(required = true)
    protected String messagId;

    /**
     * ��ȡfromSystemCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSystemCode() {
        return fromSystemCode;
    }

    /**
     * ����fromSystemCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSystemCode(String value) {
        this.fromSystemCode = value;
    }

    /**
     * ��ȡtoSystemCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSystemCode() {
        return toSystemCode;
    }

    /**
     * ����toSystemCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSystemCode(String value) {
        this.toSystemCode = value;
    }

    /**
     * ��ȡmessagId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessagId() {
        return messagId;
    }

    /**
     * ����messagId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessagId(String value) {
        this.messagId = value;
    }

}
