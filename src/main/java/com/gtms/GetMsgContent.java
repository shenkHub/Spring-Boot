
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMsgContent complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="GetMsgContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}getMsgContentInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMsgContent", propOrder = {
    "parmInput"
})
public class GetMsgContent {

    protected GetMsgContentInput parmInput;

    /**
     * ��ȡparmInput���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link GetMsgContentInput }
     *     
     */
    public GetMsgContentInput getParmInput() {
        return parmInput;
    }

    /**
     * ����parmInput���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link GetMsgContentInput }
     *     
     */
    public void setParmInput(GetMsgContentInput value) {
        this.parmInput = value;
    }

}
