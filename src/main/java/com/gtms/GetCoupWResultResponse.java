
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCoupWResultResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCoupWResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}coupWOffOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoupWResultResponse", propOrder = {
    "parmOutput"
})
public class GetCoupWResultResponse {

    protected CoupWOffOut parmOutput;

    /**
     * ��ȡparmOutput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CoupWOffOut }
     *     
     */
    public CoupWOffOut getParmOutput() {
        return parmOutput;
    }

    /**
     * ����parmOutput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CoupWOffOut }
     *     
     */
    public void setParmOutput(CoupWOffOut value) {
        this.parmOutput = value;
    }

}
