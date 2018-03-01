
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>rankUpGiftIn complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="rankUpGiftIn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rank" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="giftKbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getKbn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rankUpGiftIn", propOrder = {
    "userId",
    "rank",
    "giftKbn",
    "getKbn"
})
public class RankUpGiftIn
    extends BaseInputInfo
{

    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String rank;
    @XmlElement(required = true)
    protected String giftKbn;
    @XmlElement(required = true)
    protected String getKbn;

    /**
     * 获取userId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * 获取rank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * 设置rank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRank(String value) {
        this.rank = value;
    }

    /**
     * 获取giftKbn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftKbn() {
        return giftKbn;
    }

    /**
     * 设置giftKbn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftKbn(String value) {
        this.giftKbn = value;
    }

    /**
     * 获取getKbn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetKbn() {
        return getKbn;
    }

    /**
     * 设置getKbn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetKbn(String value) {
        this.getKbn = value;
    }

}
