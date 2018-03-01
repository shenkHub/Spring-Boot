
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCoupVeriInfoResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getCoupVeriInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}coupVeriInfoOut" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCoupVeriInfoResponse", propOrder = {
    "parmOutput"
})
public class GetCoupVeriInfoResponse {

    protected CoupVeriInfoOut parmOutput;

    /**
     * 获取parmOutput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CoupVeriInfoOut }
     *     
     */
    public CoupVeriInfoOut getParmOutput() {
        return parmOutput;
    }

    /**
     * 设置parmOutput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CoupVeriInfoOut }
     *     
     */
    public void setParmOutput(CoupVeriInfoOut value) {
        this.parmOutput = value;
    }

}
