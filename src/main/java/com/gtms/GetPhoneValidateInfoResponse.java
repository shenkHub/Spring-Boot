
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPhoneValidateInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getPhoneValidateInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}memberPhoneValidateInfoOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPhoneValidateInfoResponse", propOrder = {
    "parmOutput"
})
public class GetPhoneValidateInfoResponse {

    protected MemberPhoneValidateInfoOutput parmOutput;

    /**
     * 获取parmOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberPhoneValidateInfoOutput }
     *     
     */
    public MemberPhoneValidateInfoOutput getParmOutput() {
        return parmOutput;
    }

    /**
     * 设置parmOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberPhoneValidateInfoOutput }
     *     
     */
    public void setParmOutput(MemberPhoneValidateInfoOutput value) {
        this.parmOutput = value;
    }

}
