
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getMsgContentEntity complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getMsgContentEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="USER_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FLG_NUM" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CURRENT_DATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CAR_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SHOPPING_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RANK_BEFORE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RANK" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="POINT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TACTNO" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMsgContentEntity", propOrder = {
    "userid",
    "flgnum",
    "currentdate",
    "carname",
    "shoppingname",
    "rankbefore",
    "rank",
    "point",
    "tactno"
})
public class GetMsgContentEntity {

    @XmlElement(name = "USER_ID")
    protected int userid;
    @XmlElement(name = "FLG_NUM")
    protected int flgnum;
    @XmlElement(name = "CURRENT_DATE", required = true)
    protected String currentdate;
    @XmlElement(name = "CAR_NAME", required = true)
    protected String carname;
    @XmlElement(name = "SHOPPING_NAME", required = true)
    protected String shoppingname;
    @XmlElement(name = "RANK_BEFORE")
    protected int rankbefore;
    @XmlElement(name = "RANK")
    protected int rank;
    @XmlElement(name = "POINT")
    protected int point;
    @XmlElement(name = "TACTNO", required = true)
    protected String tactno;

    /**
     * 获取userid属性的值。
     * 
     */
    public int getUSERID() {
        return userid;
    }

    /**
     * 设置userid属性的值。
     * 
     */
    public void setUSERID(int value) {
        this.userid = value;
    }

    /**
     * 获取flgnum属性的值。
     * 
     */
    public int getFLGNUM() {
        return flgnum;
    }

    /**
     * 设置flgnum属性的值。
     * 
     */
    public void setFLGNUM(int value) {
        this.flgnum = value;
    }

    /**
     * 获取currentdate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCURRENTDATE() {
        return currentdate;
    }

    /**
     * 设置currentdate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCURRENTDATE(String value) {
        this.currentdate = value;
    }

    /**
     * 获取carname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCARNAME() {
        return carname;
    }

    /**
     * 设置carname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCARNAME(String value) {
        this.carname = value;
    }

    /**
     * 获取shoppingname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHOPPINGNAME() {
        return shoppingname;
    }

    /**
     * 设置shoppingname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHOPPINGNAME(String value) {
        this.shoppingname = value;
    }

    /**
     * 获取rankbefore属性的值。
     * 
     */
    public int getRANKBEFORE() {
        return rankbefore;
    }

    /**
     * 设置rankbefore属性的值。
     * 
     */
    public void setRANKBEFORE(int value) {
        this.rankbefore = value;
    }

    /**
     * 获取rank属性的值。
     * 
     */
    public int getRANK() {
        return rank;
    }

    /**
     * 设置rank属性的值。
     * 
     */
    public void setRANK(int value) {
        this.rank = value;
    }

    /**
     * 获取point属性的值。
     * 
     */
    public int getPOINT() {
        return point;
    }

    /**
     * 设置point属性的值。
     * 
     */
    public void setPOINT(int value) {
        this.point = value;
    }

    /**
     * 获取tactno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTACTNO() {
        return tactno;
    }

    /**
     * 设置tactno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTACTNO(String value) {
        this.tactno = value;
    }

}
