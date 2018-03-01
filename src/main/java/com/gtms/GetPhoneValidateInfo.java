
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPhoneValidateInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getPhoneValidateInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}memberPhoneValidateInfoInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getPhoneValidateInfo", propOrder = {
    "parmInput"
})
public class GetPhoneValidateInfo {

    protected MemberPhoneValidateInfoInput parmInput;

    /**
     * 获取parmInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MemberPhoneValidateInfoInput }
     *     
     */
    public MemberPhoneValidateInfoInput getParmInput() {
        return parmInput;
    }

    /**
     * 设置parmInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MemberPhoneValidateInfoInput }
     *     
     */
    public void setParmInput(MemberPhoneValidateInfoInput value) {
        this.parmInput = value;
    }

}
