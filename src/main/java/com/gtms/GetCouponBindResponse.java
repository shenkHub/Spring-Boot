
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCouponBindResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCouponBindResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}coupBindOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCouponBindResponse", propOrder = {
    "parmOutput"
})
public class GetCouponBindResponse {

    protected CoupBindOut parmOutput;

    /**
     * ��ȡparmOutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CoupBindOut }
     *     
     */
    public CoupBindOut getParmOutput() {
        return parmOutput;
    }

    /**
     * ����parmOutput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CoupBindOut }
     *     
     */
    public void setParmOutput(CoupBindOut value) {
        this.parmOutput = value;
    }

}
