
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPhoneValidateInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡparmInput���Ե�ֵ��
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
     * ����parmInput���Ե�ֵ��
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
