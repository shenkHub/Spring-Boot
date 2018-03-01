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
 * 2017-12-20T21:32:09.415+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://gtms.com/", name = "GetUserIdTelService")
@XmlSeeAlso({ObjectFactory.class})
public interface GetUserIdTelService {

    @WebResult(name = "parmOutput", targetNamespace = "")
    @RequestWrapper(localName = "GetUserInfo", targetNamespace = "http://gtms.com/", className = "com.gtms.GetUserInfo")
    @WebMethod(operationName = "GetUserInfo")
    @ResponseWrapper(localName = "GetUserInfoResponse", targetNamespace = "http://gtms.com/", className = "com.gtms.GetUserInfoResponse")
    public com.gtms.GetUserIdTelOutput getUserInfo(
        @WebParam(name = "parmInput", targetNamespace = "")
        com.gtms.GetUserIdTelInput parmInput
    );
}