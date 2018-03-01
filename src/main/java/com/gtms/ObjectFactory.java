
package com.gtms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gtms package. 
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

    private final static QName _GetPhoneValidateInfo_QNAME = new QName("http://gtms.com/", "getPhoneValidateInfo");
    private final static QName _GetPhoneValidateInfoResponse_QNAME = new QName("http://gtms.com/", "getPhoneValidateInfoResponse");

    
    private final static QName _GetCouponBindResponse_QNAME = new QName("http://gtms.com/", "getCouponBindResponse");
    private final static QName _GetCouponBind_QNAME = new QName("http://gtms.com/", "getCouponBind");
    
    private final static QName _GetCoupVeriInfo_QNAME = new QName("http://gtms.com/", "getCoupVeriInfo");
    private final static QName _GetCoupVeriInfoResponse_QNAME = new QName("http://gtms.com/", "getCoupVeriInfoResponse");
    
    
    private final static QName _GetCoupWResultResponse_QNAME = new QName("http://gtms.com/", "getCoupWResultResponse");
    private final static QName _GetCoupWResult_QNAME = new QName("http://gtms.com/", "getCoupWResult");
    
    
    private final static QName _GetMsgContent_QNAME = new QName("http://gtms.com/", "GetMsgContent");
    private final static QName _GetMsgContentResponse_QNAME = new QName("http://gtms.com/", "GetMsgContentResponse");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gtms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPhoneValidateInfoResponse }
     * 
     */
    public GetPhoneValidateInfoResponse createGetPhoneValidateInfoResponse() {
        return new GetPhoneValidateInfoResponse();
    }

    /**
     * Create an instance of {@link GetPhoneValidateInfo }
     * 
     */
    public GetPhoneValidateInfo createGetPhoneValidateInfo() {
        return new GetPhoneValidateInfo();
    }

    /**
     * Create an instance of {@link BaseOutputInfo }
     * 
     */
    public BaseOutputInfo createBaseOutputInfo() {
        return new BaseOutputInfo();
    }

    /**
     * Create an instance of {@link BaseInputInfo }
     * 
     */
    public BaseInputInfo createBaseInputInfo() {
        return new BaseInputInfo();
    }

    /**
     * Create an instance of {@link MemberPhoneValidateInfoInput }
     * 
     */
    public MemberPhoneValidateInfoInput createMemberPhoneValidateInfoInput() {
        return new MemberPhoneValidateInfoInput();
    }

    /**
     * Create an instance of {@link MemberPhoneValidateInfoOutput }
     * 
     */
    public MemberPhoneValidateInfoOutput createMemberPhoneValidateInfoOutput() {
        return new MemberPhoneValidateInfoOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneValidateInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getPhoneValidateInfo")
    public JAXBElement<GetPhoneValidateInfo> createGetPhoneValidateInfo(GetPhoneValidateInfo value) {
        return new JAXBElement<GetPhoneValidateInfo>(_GetPhoneValidateInfo_QNAME, GetPhoneValidateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhoneValidateInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getPhoneValidateInfoResponse")
    public JAXBElement<GetPhoneValidateInfoResponse> createGetPhoneValidateInfoResponse(GetPhoneValidateInfoResponse value) {
        return new JAXBElement<GetPhoneValidateInfoResponse>(_GetPhoneValidateInfoResponse_QNAME, GetPhoneValidateInfoResponse.class, null, value);
    }
    
    
    
    
    /**
     * Create an instance of {@link GetCouponBindResponse }
     * 
     */
    public GetCouponBindResponse createGetCouponBindResponse() {
        return new GetCouponBindResponse();
    }

    /**
     * Create an instance of {@link GetCouponBind }
     * 
     */
    public GetCouponBind createGetCouponBind() {
        return new GetCouponBind();
    }

    /**
     * Create an instance of {@link CoupBindOut }
     * 
     */
    public CoupBindOut createCoupBindOut() {
        return new CoupBindOut();
    }


    /**
     * Create an instance of {@link CoupBindIn }
     * 
     */
    public CoupBindIn createCoupBindIn() {
        return new CoupBindIn();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouponBindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCouponBindResponse")
    public JAXBElement<GetCouponBindResponse> createGetCouponBindResponse(GetCouponBindResponse value) {
        return new JAXBElement<GetCouponBindResponse>(_GetCouponBindResponse_QNAME, GetCouponBindResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouponBind }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCouponBind")
    public JAXBElement<GetCouponBind> createGetCouponBind(GetCouponBind value) {
        return new JAXBElement<GetCouponBind>(_GetCouponBind_QNAME, GetCouponBind.class, null, value);
    }
    
    
    
    /**
     * Create an instance of {@link GetCoupVeriInfo }
     * 
     */
    public GetCoupVeriInfo createGetCoupVeriInfo() {
        return new GetCoupVeriInfo();
    }

    /**
     * Create an instance of {@link GetCoupVeriInfoResponse }
     * 
     */
    public GetCoupVeriInfoResponse createGetCoupVeriInfoResponse() {
        return new GetCoupVeriInfoResponse();
    }

    /**
     * Create an instance of {@link CoupVeriInfoIn }
     * 
     */
    public CoupVeriInfoIn createCoupVeriInfoIn() {
        return new CoupVeriInfoIn();
    }

    /**
     * Create an instance of {@link CoupVeriInfoOut }
     * 
     */
    public CoupVeriInfoOut createCoupVeriInfoOut() {
        return new CoupVeriInfoOut();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoupVeriInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCoupVeriInfo")
    public JAXBElement<GetCoupVeriInfo> createGetCoupVeriInfo(GetCoupVeriInfo value) {
        return new JAXBElement<GetCoupVeriInfo>(_GetCoupVeriInfo_QNAME, GetCoupVeriInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoupVeriInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCoupVeriInfoResponse")
    public JAXBElement<GetCoupVeriInfoResponse> createGetCoupVeriInfoResponse(GetCoupVeriInfoResponse value) {
        return new JAXBElement<GetCoupVeriInfoResponse>(_GetCoupVeriInfoResponse_QNAME, GetCoupVeriInfoResponse.class, null, value);
    }
    
    
    
    
    /**
     * Create an instance of {@link GetCoupWResultResponse }
     * 
     */
    public GetCoupWResultResponse createGetCoupWResultResponse() {
        return new GetCoupWResultResponse();
    }

    /**
     * Create an instance of {@link GetCoupWResult }
     * 
     */
    public GetCoupWResult createGetCoupWResult() {
        return new GetCoupWResult();
    }


    /**
     * Create an instance of {@link CouponWOffIn }
     * 
     */
    public CouponWOffIn createCouponWOffIn() {
        return new CouponWOffIn();
    }

    /**
     * Create an instance of {@link CoupWOffOut }
     * 
     */
    public CoupWOffOut createCoupWOffOut() {
        return new CoupWOffOut();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoupWResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCoupWResultResponse")
    public JAXBElement<GetCoupWResultResponse> createGetCoupWResultResponse(GetCoupWResultResponse value) {
        return new JAXBElement<GetCoupWResultResponse>(_GetCoupWResultResponse_QNAME, GetCoupWResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoupWResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "getCoupWResult")
    public JAXBElement<GetCoupWResult> createGetCoupWResult(GetCoupWResult value) {
        return new JAXBElement<GetCoupWResult>(_GetCoupWResult_QNAME, GetCoupWResult.class, null, value);
    }
    
    
    
    
    /**
     * Create an instance of {@link GetMsgContent }
     * 
     */
    public GetMsgContent createGetMsgContent() {
        return new GetMsgContent();
    }

    /**
     * Create an instance of {@link GetMsgContentResponse }
     * 
     */
    public GetMsgContentResponse createGetMsgContentResponse() {
        return new GetMsgContentResponse();
    }

    /**
     * Create an instance of {@link GetMsgContentEntity }
     * 
     */
    public GetMsgContentEntity createGetMsgContentEntity() {
        return new GetMsgContentEntity();
    }

    /**
     * Create an instance of {@link GetMsgContentOutput }
     * 
     */
    public GetMsgContentOutput createGetMsgContentOutput() {
        return new GetMsgContentOutput();
    }

    /**
     * Create an instance of {@link GetMsgContentInput }
     * 
     */
    public GetMsgContentInput createGetMsgContentInput() {
        return new GetMsgContentInput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsgContent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "GetMsgContent")
    public JAXBElement<GetMsgContent> createGetMsgContent(GetMsgContent value) {
        return new JAXBElement<GetMsgContent>(_GetMsgContent_QNAME, GetMsgContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMsgContentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gtms.com/", name = "GetMsgContentResponse")
    public JAXBElement<GetMsgContentResponse> createGetMsgContentResponse(GetMsgContentResponse value) {
        return new JAXBElement<GetMsgContentResponse>(_GetMsgContentResponse_QNAME, GetMsgContentResponse.class, null, value);
    }

}
