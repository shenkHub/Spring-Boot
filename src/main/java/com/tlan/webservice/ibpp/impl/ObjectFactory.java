
package com.tlan.webservice.ibpp.impl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tlan.webservice.ibpp.impl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SendredpackResponse_QNAME = new QName("http://impl.IBPP.webservice.tlan.com/", "sendredpackResponse");
    private final static QName _Sendredpack_QNAME = new QName("http://impl.IBPP.webservice.tlan.com/", "sendredpack");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tlan.webservice.ibpp.impl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Sendredpack }
     * 
     */
    public Sendredpack createSendredpack() {
        return new Sendredpack();
    }

    /**
     * Create an instance of {@link SendredpackResponse }
     * 
     */
    public SendredpackResponse createSendredpackResponse() {
        return new SendredpackResponse();
    }

    /**
     * Create an instance of {@link RedPackOutput }
     * 
     */
    public RedPackOutput createRedPackOutput() {
        return new RedPackOutput();
    }

    /**
     * Create an instance of {@link RedPackInput }
     * 
     */
    public RedPackInput createRedPackInput() {
        return new RedPackInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendredpackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.IBPP.webservice.tlan.com/", name = "sendredpackResponse")
    public JAXBElement<SendredpackResponse> createSendredpackResponse(SendredpackResponse value) {
        return new JAXBElement<SendredpackResponse>(_SendredpackResponse_QNAME, SendredpackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sendredpack }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://impl.IBPP.webservice.tlan.com/", name = "sendredpack")
    public JAXBElement<Sendredpack> createSendredpack(Sendredpack value) {
        return new JAXBElement<Sendredpack>(_Sendredpack_QNAME, Sendredpack.class, null, value);
    }

}
