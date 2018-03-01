
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTempletMsgInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTempletMsgInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}getTempletMsgOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempletMsgInfoResponse", propOrder = {
    "parmOutput"
})
public class GetTempletMsgInfoResponse {

    protected GetTempletMsgOutput parmOutput;

    /**
     * 获取parmOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GetTempletMsgOutput }
     *     
     */
    public GetTempletMsgOutput getParmOutput() {
        return parmOutput;
    }

    /**
     * 设置parmOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GetTempletMsgOutput }
     *     
     */
    public void setParmOutput(GetTempletMsgOutput value) {
        this.parmOutput = value;
    }

}
