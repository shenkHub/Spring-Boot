
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getPhoneValidateInfoResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡparmOutput���Ե�ֵ��
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
     * ����parmOutput���Ե�ֵ��
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
