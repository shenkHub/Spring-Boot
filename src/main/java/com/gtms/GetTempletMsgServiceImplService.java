package com.gtms;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2017-04-17T16:12:50.102+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "GetTempletMsgServiceImplService", 
                  wsdlLocation = "getTempletMsgInfo.wsdl",
                  targetNamespace = "http://gtms.com/") 
public class GetTempletMsgServiceImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gtms.com/", "GetTempletMsgServiceImplService");
    public final static QName GetTempletMsgServiceImplPort = new QName("http://gtms.com/", "GetTempletMsgServiceImplPort");
    static {
        URL url = GetTempletMsgServiceImplService.class.getResource("getTempletMsgInfo.wsdl");
        if (url == null) {
            url = GetTempletMsgServiceImplService.class.getClassLoader().getResource("getTempletMsgInfo.wsdl");
        } 
        if (url == null) {
            java.util.logging.Logger.getLogger(GetTempletMsgServiceImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "getTempletMsgInfo.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public GetTempletMsgServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetTempletMsgServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetTempletMsgServiceImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns GetTempletMsgService
     */
    @WebEndpoint(name = "GetTempletMsgServiceImplPort")
    public GetTempletMsgService getGetTempletMsgServiceImplPort() {
        return super.getPort(GetTempletMsgServiceImplPort, GetTempletMsgService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetTempletMsgService
     */
    @WebEndpoint(name = "GetTempletMsgServiceImplPort")
    public GetTempletMsgService getGetTempletMsgServiceImplPort(WebServiceFeature... features) {
        return super.getPort(GetTempletMsgServiceImplPort, GetTempletMsgService.class, features);
    }

}
