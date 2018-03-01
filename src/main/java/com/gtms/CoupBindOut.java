
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupBindOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="coupBindOut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="bindingResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="breakRuleContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "coupBindOut", propOrder = {
    "bindingResult",
    "breakRuleContent"
})
public class CoupBindOut
    extends BaseOutputInfo
{

    protected int bindingResult;
    @XmlElement(required = true)
    protected String breakRuleContent;

    /**
     * 获取bindingResult属性的值。
     * 
     */
    public int getBindingResult() {
        return bindingResult;
    }

    /**
     * 设置bindingResult属性的值。
     * 
     */
    public void setBindingResult(int value) {
        this.bindingResult = value;
    }

    /**
     * 获取breakRuleContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBreakRuleContent() {
        return breakRuleContent;
    }

    /**
     * 设置breakRuleContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBreakRuleContent(String value) {
        this.breakRuleContent = value;
    }

}
