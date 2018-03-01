
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupVeriInfoIn complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="coupVeriInfoIn">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="couponId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dealerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sfxCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="vinNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkModel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupVeriInfoIn", propOrder = {
    "couponId",
    "dealerCode",
    "sfxCode",
    "vinNo",
    "checkModel"
})
public class CoupVeriInfoIn
    extends BaseInputInfo
{

    @XmlElement(required = true)
    protected String couponId;
    @XmlElement(required = true)
    protected String dealerCode;
    @XmlElement(required = true)
    protected String sfxCode;
    @XmlElement(required = true)
    protected String vinNo;
    @XmlElement(required = true)
    protected String checkModel;

    /**
     * ��ȡcouponId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponId() {
        return couponId;
    }

    /**
     * ����couponId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponId(String value) {
        this.couponId = value;
    }

    /**
     * ��ȡdealerCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * ����dealerCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * ��ȡsfxCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSfxCode() {
        return sfxCode;
    }

    /**
     * ����sfxCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSfxCode(String value) {
        this.sfxCode = value;
    }

    /**
     * ��ȡvinNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVinNo() {
        return vinNo;
    }

    /**
     * ����vinNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVinNo(String value) {
        this.vinNo = value;
    }

    /**
     * ��ȡcheckModel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckModel() {
        return checkModel;
    }

    /**
     * ����checkModel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckModel(String value) {
        this.checkModel = value;
    }

}
