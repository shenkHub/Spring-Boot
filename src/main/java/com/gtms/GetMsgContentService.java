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
 * 2016-05-11T10:42:27.879+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebService(targetNamespace = "http://gtms.com/", name = "GetMsgContentService")
@XmlSeeAlso({ObjectFactory.class})
public interface GetMsgContentService {

    @WebResult(name = "parmOutput", targetNamespace = "")
    @RequestWrapper(localName = "GetMsgContent", targetNamespace = "http://gtms.com/", className = "com.gtms.GetMsgContent")
    @WebMethod(operationName = "GetMsgContent")
    @ResponseWrapper(localName = "GetMsgContentResponse", targetNamespace = "http://gtms.com/", className = "com.gtms.GetMsgContentResponse")
    public com.gtms.GetMsgContentOutput getMsgContent(
        @WebParam(name = "parmInput", targetNamespace = "")
        com.gtms.GetMsgContentInput parmInput
    );
}
