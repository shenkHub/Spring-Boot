package com.gtms;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2017-04-13T13:43:53.140+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://gtms.com/", name = "RankUpGiftService")
@XmlSeeAlso({ObjectFactory.class})
public interface RankUpGiftService {

    @WebResult(name = "parmOutput", targetNamespace = "")
    @RequestWrapper(localName = "getRankUpGift", targetNamespace = "http://gtms.com/", className = "com.gtms.GetRankUpGift")
    @WebMethod
    @ResponseWrapper(localName = "getRankUpGiftResponse", targetNamespace = "http://gtms.com/", className = "com.gtms.GetRankUpGiftResponse")
    public com.gtms.RankUpGiftOut getRankUpGift(
        @WebParam(name = "parmInput", targetNamespace = "")
        com.gtms.RankUpGiftIn parmInput
    );
}
