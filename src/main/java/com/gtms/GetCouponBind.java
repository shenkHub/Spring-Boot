
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCouponBind complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCouponBind">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}coupBindIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCouponBind", propOrder = {
    "parmInput"
})
public class GetCouponBind {

    protected CoupBindIn parmInput;

    /**
     * ��ȡparmInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CoupBindIn }
     *     
     */
    public CoupBindIn getParmInput() {
        return parmInput;
    }

    /**
     * ����parmInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CoupBindIn }
     *     
     */
    public void setParmInput(CoupBindIn value) {
        this.parmInput = value;
    }

}
