
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCoupVeriInfo complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getCoupVeriInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}coupVeriInfoIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoupVeriInfo", propOrder = {
    "parmInput"
})
public class GetCoupVeriInfo {

    protected CoupVeriInfoIn parmInput;

    /**
     * ��ȡparmInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link CoupVeriInfoIn }
     *     
     */
    public CoupVeriInfoIn getParmInput() {
        return parmInput;
    }

    /**
     * ����parmInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link CoupVeriInfoIn }
     *     
     */
    public void setParmInput(CoupVeriInfoIn value) {
        this.parmInput = value;
    }

}
