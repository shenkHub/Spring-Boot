
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>coupBindOut complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡbindingResult���Ե�ֵ��
     * 
     */
    public int getBindingResult() {
        return bindingResult;
    }

    /**
     * ����bindingResult���Ե�ֵ��
     * 
     */
    public void setBindingResult(int value) {
        this.bindingResult = value;
    }

    /**
     * ��ȡbreakRuleContent���Ե�ֵ��
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
     * ����breakRuleContent���Ե�ֵ��
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
