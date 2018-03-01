
package com.gtms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getUserIdTelInput complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="getUserIdTelInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="inputList" type="{http://gtms.com/}getUserIdTel002Entity" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUserIdTelInput", propOrder = {
    "inputList"
})
public class GetUserIdTelInput
    extends BaseInputInfo
{

    @XmlElement(required = true)
    protected List<GetUserIdTel002Entity> inputList;

    /**
     * Gets the value of the inputList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetUserIdTel002Entity }
     * 
     * 
     */
    public List<GetUserIdTel002Entity> getInputList() {
        if (inputList == null) {
            inputList = new ArrayList<GetUserIdTel002Entity>();
        }
        return this.inputList;
    }

	public void setInputList(List<GetUserIdTel002Entity> inputList) {
		this.inputList = inputList;
	}
    

}
