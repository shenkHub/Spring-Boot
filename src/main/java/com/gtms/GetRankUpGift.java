
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getRankUpGift complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getRankUpGift">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}rankUpGiftIn" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRankUpGift", propOrder = {
    "parmInput"
})
public class GetRankUpGift {

    protected RankUpGiftIn parmInput;

    /**
     * 获取parmInput属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RankUpGiftIn }
     *     
     */
    public RankUpGiftIn getParmInput() {
        return parmInput;
    }

    /**
     * 设置parmInput属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RankUpGiftIn }
     *     
     */
    public void setParmInput(RankUpGiftIn value) {
        this.parmInput = value;
    }

}
