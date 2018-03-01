
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>memberPhoneValidateInfoOutput complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="memberPhoneValidateInfoOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="resultFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "memberPhoneValidateInfoOutput", propOrder = {
    "resultFlag"
})
public class MemberPhoneValidateInfoOutput
    extends BaseOutputInfo
{

    protected String resultFlag;

    /**
     * 获取resultFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFlag() {
        return resultFlag;
    }

    /**
     * 设置resultFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFlag(String value) {
        this.resultFlag = value;
    }

}
