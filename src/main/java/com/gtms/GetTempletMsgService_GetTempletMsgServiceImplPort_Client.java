
package com.gtms;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2017-04-17T16:12:50.029+08:00
 * Generated source version: 2.7.6
 * 
 */
public final class GetTempletMsgService_GetTempletMsgServiceImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://gtms.com/", "GetTempletMsgServiceImplService");

    private GetTempletMsgService_GetTempletMsgServiceImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GetTempletMsgServiceImplService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        GetTempletMsgServiceImplService ss = new GetTempletMsgServiceImplService(wsdlURL, SERVICE_NAME);
        GetTempletMsgService port = ss.getGetTempletMsgServiceImplPort();  
        
        {
        System.out.println("Invoking getTempletMsgInfo...");
        com.gtms.GetTempletMsgInput _getTempletMsgInfo_parmInput = null;
        com.gtms.GetTempletMsgOutput _getTempletMsgInfo__return = port.getTempletMsgInfo(_getTempletMsgInfo_parmInput);
        System.out.println("getTempletMsgInfo.result=" + _getTempletMsgInfo__return);


        }

        System.exit(0);
    }

}
