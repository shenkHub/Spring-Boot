
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMsgContent complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取parmInput属性的值。
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
     * 设置parmInput属性的值。
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
