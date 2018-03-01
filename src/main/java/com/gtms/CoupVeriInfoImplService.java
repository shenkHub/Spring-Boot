package com.gtms;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.6
 * 2016-04-29T09:53:44.772+08:00
 * Generated source version: 2.7.6
 * 
 */
@WebServiceClient(name = "CoupVeriInfoImplService", 
                  wsdlLocation = "file:/D:/广汽丰田/Iclub/couponServiceXML/getCoupVeriInfo.xml",
                  targetNamespace = "http://gtms.com/") 
public class CoupVeriInfoImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gtms.com/", "CoupVeriInfoImplService");
    public final static QName CoupVeriInfoImplPort = new QName("http://gtms.com/", "CoupVeriInfoImplPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/广汽丰田/Iclub/couponServiceXML/getCoupVeriInfo.xml");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CoupVeriInfoImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/广汽丰田/Iclub/couponServiceXML/getCoupVeriInfo.xml");
        }
        WSDL_LOCATION = url;
    }

    public CoupVeriInfoImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CoupVeriInfoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoupVeriInfoImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CoupVeriInfoImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CoupVeriInfoImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public CoupVeriInfoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns CoupVeriInfoService
     */
    @WebEndpoint(name = "CoupVeriInfoImplPort")
    public CoupVeriInfoService getCoupVeriInfoImplPort() {
        return super.getPort(CoupVeriInfoImplPort, CoupVeriInfoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoupVeriInfoService
     */
    @WebEndpoint(name = "CoupVeriInfoImplPort")
    public CoupVeriInfoService getCoupVeriInfoImplPort(WebServiceFeature... features) {
        return super.getPort(CoupVeriInfoImplPort, CoupVeriInfoService.class, features);
    }

}
