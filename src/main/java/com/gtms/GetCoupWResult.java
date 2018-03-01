
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getCoupWResult complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取parmInput属性的值。
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
     * 设置parmInput属性的值。
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
