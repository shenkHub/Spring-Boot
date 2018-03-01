
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetUserInfo complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetUserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmInput" type="{http://gtms.com/}getUserIdTelInput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserInfo", propOrder = {
    "parmInput"
})
public class GetUserInfo {

    protected GetUserIdTelInput parmInput;

    /**
     * parmInputプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GetUserIdTelInput }
     *     
     */
    public GetUserIdTelInput getParmInput() {
        return parmInput;
    }

    /**
     * parmInputプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserIdTelInput }
     *     
     */
    public void setParmInput(GetUserIdTelInput value) {
        this.parmInput = value;
    }

}
