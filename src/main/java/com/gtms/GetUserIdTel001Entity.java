
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getUserIdTel001Entity complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="getUserIdTel001Entity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TEL_NO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BIRTHDAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserIdTel001Entity", propOrder = {
    "telno",
    "userid",
    "birthday"
})
public class GetUserIdTel001Entity {

    @XmlElement(name = "TEL_NO", required = true)
    protected String telno;
    @XmlElement(name = "USER_ID")
    protected int userid;
    @XmlElement(name = "BIRTHDAY", required = true)
    protected String birthday;

    /**
     * telnoプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTELNO() {
        return telno;
    }

    /**
     * telnoプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTELNO(String value) {
        this.telno = value;
    }

    /**
     * useridプロパティの値を取得します。
     * 
     */
    public int getUSERID() {
        return userid;
    }

    /**
     * useridプロパティの値を設定します。
     * 
     */
    public void setUSERID(int value) {
        this.userid = value;
    }

    /**
     * birthdayプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIRTHDAY() {
        return birthday;
    }

    /**
     * birthdayプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIRTHDAY(String value) {
        this.birthday = value;
    }

}
