
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
 * 2016-04-29T09:53:44.733+08:00
 * Generated source version: 2.7.6
 * 
 */
public final class CoupVeriInfoService_CoupVeriInfoImplPort_Client {

    private static final QName SERVICE_NAME = new QName("http://gtms.com/", "CoupVeriInfoImplService");

    private CoupVeriInfoService_CoupVeriInfoImplPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CoupVeriInfoImplService.WSDL_LOCATION;
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
      
        CoupVeriInfoImplService ss = new CoupVeriInfoImplService(wsdlURL, SERVICE_NAME);
        CoupVeriInfoService port = ss.getCoupVeriInfoImplPort();  
        
        {
        System.out.println("Invoking getCoupVeriInfo...");
        com.gtms.CoupVeriInfoIn _getCoupVeriInfo_parmInput = null;
        com.gtms.CoupVeriInfoOut _getCoupVeriInfo__return = port.getCoupVeriInfo(_getCoupVeriInfo_parmInput);
        System.out.println("getCoupVeriInfo.result=" + _getCoupVeriInfo__return);


        }

        System.exit(0);
    }

}
