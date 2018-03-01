
package com.gtms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getUserIdTelOutput complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="getUserIdTelOutput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseOutputInfo">
 *       &lt;sequence>
 *         &lt;element name="outPutList" type="{http://gtms.com/}getUserIdTel001Entity" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserIdTelOutput", propOrder = {
    "outPutList"
})
public class GetUserIdTelOutput
    extends BaseOutputInfo
{

    @XmlElement(required = true)
    protected List<GetUserIdTel001Entity> outPutList;

    /**
     * Gets the value of the outPutList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outPutList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutPutList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetUserIdTel001Entity }
     * 
     * 
     */
    public List<GetUserIdTel001Entity> getOutPutList() {
        if (outPutList == null) {
            outPutList = new ArrayList<GetUserIdTel001Entity>();
        }
        return this.outPutList;
    }

}
