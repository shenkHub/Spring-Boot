
package com.gtms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTempletMsgInput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTempletMsgInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="templetId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="paramList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempletMsgInput", propOrder = {
    "templetId",
    "paramList"
})
public class GetTempletMsgInput
    extends BaseInputInfo
{

    @XmlElement(required = true)
    protected String templetId;
    @XmlElement(required = true)
    protected List<String> paramList;

    /**
     * 获取templetId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTempletId() {
        return templetId;
    }

    /**
     * 设置templetId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTempletId(String value) {
        this.templetId = value;
    }

    /**
     * Gets the value of the paramList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paramList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParamList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getParamList() {
        if (paramList == null) {
            paramList = new ArrayList<String>();
        }
        return this.paramList;
    }

	public void setParamList(List<String> paramList) {
		this.paramList = paramList;
	}
    
    

}
