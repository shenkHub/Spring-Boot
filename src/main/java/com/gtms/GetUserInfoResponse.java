
package com.gtms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>GetUserInfoResponse complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="GetUserInfoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parmOutput" type="{http://gtms.com/}getUserIdTelOutput" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserInfoResponse", propOrder = {
    "parmOutput"
})
public class GetUserInfoResponse {

    protected GetUserIdTelOutput parmOutput;

    /**
     * parmOutputプロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link GetUserIdTelOutput }
     *     
     */
    public GetUserIdTelOutput getParmOutput() {
        return parmOutput;
    }

    /**
     * parmOutputプロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link GetUserIdTelOutput }
     *     
     */
    public void setParmOutput(GetUserIdTelOutput value) {
        this.parmOutput = value;
    }

}
