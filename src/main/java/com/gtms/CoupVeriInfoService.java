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
 * 2016-04-29T09:53:44.766+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://gtms.com/", name = "CoupVeriInfoService")
@XmlSeeAlso({ObjectFactory.class})
public interface CoupVeriInfoService {

    @WebResult(name = "parmOutput", targetNamespace = "")
    @RequestWrapper(localName = "getCoupVeriInfo", targetNamespace = "http://gtms.com/", className = "com.gtms.GetCoupVeriInfo")
    @WebMethod
    @ResponseWrapper(localName = "getCoupVeriInfoResponse", targetNamespace = "http://gtms.com/", className = "com.gtms.GetCoupVeriInfoResponse")
    public com.gtms.CoupVeriInfoOut getCoupVeriInfo(
        @WebParam(name = "parmInput", targetNamespace = "")
        com.gtms.CoupVeriInfoIn parmInput
    );
}