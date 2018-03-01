
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getMsgContentEntity complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡuserid���Ե�ֵ��
     * 
     */
    public int getUSERID() {
        return userid;
    }

    /**
     * ����userid���Ե�ֵ��
     * 
     */
    public void setUSERID(int value) {
        this.userid = value;
    }

    /**
     * ��ȡflgnum���Ե�ֵ��
     * 
     */
    public int getFLGNUM() {
        return flgnum;
    }

    /**
     * ����flgnum���Ե�ֵ��
     * 
     */
    public void setFLGNUM(int value) {
        this.flgnum = value;
    }

    /**
     * ��ȡcurrentdate���Ե�ֵ��
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
     * ����currentdate���Ե�ֵ��
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
     * ��ȡcarname���Ե�ֵ��
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
     * ����carname���Ե�ֵ��
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
     * ��ȡshoppingname���Ե�ֵ��
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
     * ����shoppingname���Ե�ֵ��
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
     * ��ȡrankbefore���Ե�ֵ��
     * 
     */
    public int getRANKBEFORE() {
        return rankbefore;
    }

    /**
     * ����rankbefore���Ե�ֵ��
     * 
     */
    public void setRANKBEFORE(int value) {
        this.rankbefore = value;
    }

    /**
     * ��ȡrank���Ե�ֵ��
     * 
     */
    public int getRANK() {
        return rank;
    }

    /**
     * ����rank���Ե�ֵ��
     * 
     */
    public void setRANK(int value) {
        this.rank = value;
    }

    /**
     * ��ȡpoint���Ե�ֵ��
     * 
     */
    public int getPOINT() {
        return point;
    }

    /**
     * ����point���Ե�ֵ��
     * 
     */
    public void setPOINT(int value) {
        this.point = value;
    }

    /**
     * ��ȡtactno���Ե�ֵ��
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
     * ����tactno���Ե�ֵ��
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
