
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCoupWResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCoupWResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}couponWOffIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoupWResult", propOrder = {
    "parmInput"
})
public class GetCoupWResult {

    protected CouponWOffIn parmInput;

    /**
     * ��ȡparmInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CouponWOffIn }
     *     
     */
    public CouponWOffIn getParmInput() {
        return parmInput;
    }

    /**
     * ����parmInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CouponWOffIn }
     *     
     */
    public void setParmInput(CouponWOffIn value) {
        this.parmInput = value;
    }

}
