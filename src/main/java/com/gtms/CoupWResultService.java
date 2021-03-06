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
 * 2016-04-29T09:53:52.583+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://gtms.com/", name = "CoupWResultService")
@XmlSeeAlso({ObjectFactory.class})
public interface CoupWResultService {

    @WebResult(name = "parmOutput", targetNamespace = "")
    @RequestWrapper(localName = "getCoupWResult", targetNamespace = "http://gtms.com/", className = "com.gtms.GetCoupWResult")
    @WebMethod
    @ResponseWrapper(localName = "getCoupWResultResponse", targetNamespace = "http://gtms.com/", className = "com.gtms.GetCoupWResultResponse")
    public com.gtms.CoupWOffOut getCoupWResult(
        @WebParam(name = "parmInput", targetNamespace = "")
        com.gtms.CouponWOffIn parmInput
    );
}
