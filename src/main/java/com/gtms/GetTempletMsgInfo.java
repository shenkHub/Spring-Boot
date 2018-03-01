
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTempletMsgInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTempletMsgInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}getTempletMsgInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempletMsgInfo", propOrder = {
    "parmInput"
})
public class GetTempletMsgInfo {

    protected GetTempletMsgInput parmInput;

    /**
     * 获取parmInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetTempletMsgInput }
     *     
     */
    public GetTempletMsgInput getParmInput() {
        return parmInput;
    }

    /**
     * 设置parmInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetTempletMsgInput }
     *     
     */
    public void setParmInput(GetTempletMsgInput value) {
        this.parmInput = value;
    }

}
