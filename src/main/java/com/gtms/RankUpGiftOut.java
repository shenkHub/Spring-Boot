
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>rankUpGiftOut complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="rankUpGiftOut">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="resultFalg" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rankUpGiftOut", propOrder = {
    "resultFalg"
})
public class RankUpGiftOut
    extends BaseOutputInfo
{

    protected int resultFalg;

    /**
     * 获取resultFalg属性的值。
     * 
     */
    public int getResultFalg() {
        return resultFalg;
    }

    /**
     * 设置resultFalg属性的值。
     * 
     */
    public void setResultFalg(int value) {
        this.resultFalg = value;
    }

}
