
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>baseOutputInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="baseOutputInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="returnFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="errorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseOutputInfo", propOrder = {
    "returnFlag",
    "errorMessage"
})
@XmlSeeAlso({
    MemberPhoneValidateInfoOutput.class,
    CoupBindOut.class,
    CoupVeriInfoOut.class,
    CoupWOffOut.class,
    GetMsgContentOutput.class
})
public class BaseOutputInfo {

    protected int returnFlag;
    protected String errorMessage;

    /**
     * ��ȡreturnFlag���Ե�ֵ��
     * 
     */
    public int getReturnFlag() {
        return returnFlag;
    }

    /**
     * ����returnFlag���Ե�ֵ��
     * 
     */
    public void setReturnFlag(int value) {
        this.returnFlag = value;
    }

    /**
     * ��ȡerrorMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * ����errorMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

}
