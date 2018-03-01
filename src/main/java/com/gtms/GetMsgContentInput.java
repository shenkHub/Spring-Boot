
package com.gtms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getMsgContentInput complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="getMsgContentInput">
 *   &lt;complexContent>
 *     &lt;extension base="{http://gtms.com/}baseInputInfo">
 *       &lt;sequence>
 *         &lt;element name="GetMsgContentList" type="{http://gtms.com/}getMsgContentEntity" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMsgContentInput", propOrder = {
    "getMsgContentList"
})
public class GetMsgContentInput
    extends BaseInputInfo
{

    @XmlElement(name = "GetMsgContentList", required = true)
    protected List<GetMsgContentEntity> getMsgContentList;

    /**
     * Gets the value of the getMsgContentList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the getMsgContentList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGetMsgContentList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMsgContentEntity }
     * 
     * 
     */
    public List<GetMsgContentEntity> getGetMsgContentList() {
        if (getMsgContentList == null) {
            getMsgContentList = new ArrayList<GetMsgContentEntity>();
        }
        return this.getMsgContentList;
    }

	/**
	 * @param getMsgContentList the getMsgContentList to set
	 */
	public void setGetMsgContentList(List<GetMsgContentEntity> getMsgContentList) {
		this.getMsgContentList = getMsgContentList;
	}
    
    

}
