
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getTempletMsgOutput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getTempletMsgOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="contentVal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getTempletMsgOutput", propOrder = {
    "contentVal"
})
public class GetTempletMsgOutput
    extends BaseOutputInfo
{

    @XmlElement(required = true)
    protected String contentVal;

    /**
     * 获取contentVal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentVal() {
        return contentVal;
    }

    /**
     * 设置contentVal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentVal(String value) {
        this.contentVal = value;
    }

}
