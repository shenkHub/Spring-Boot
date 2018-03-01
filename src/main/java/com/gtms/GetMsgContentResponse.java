
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetMsgContentResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GetMsgContentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}getMsgContentOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetMsgContentResponse", propOrder = {
    "parmOutput"
})
public class GetMsgContentResponse {

    protected GetMsgContentOutput parmOutput;

    /**
     * 获取parmOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetMsgContentOutput }
     *     
     */
    public GetMsgContentOutput getParmOutput() {
        return parmOutput;
    }

    /**
     * 设置parmOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetMsgContentOutput }
     *     
     */
    public void setParmOutput(GetMsgContentOutput value) {
        this.parmOutput = value;
    }

}
