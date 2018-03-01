
package com.yonyou.est.webservice.coupon;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.yonyou.est.webservice.coupon package. 
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

    private final static QName _OffsetCouponResponse_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "offsetCouponResponse");
    private final static QName _UseCoupon_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "useCoupon");
    private final static QName _VarifyCoupon_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "varifyCoupon");
    private final static QName _OffsetCoupon_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "offsetCoupon");
    private final static QName _VarifyCouponResponse_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "varifyCouponResponse");
    private final static QName _GetCouponListResponse_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "getCouponListResponse");
    private final static QName _UseCouponResponse_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "useCouponResponse");
    private final static QName _GetCouponList_QNAME = new QName("http://coupon.webService.est.yonyou.com/", "getCouponList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.yonyou.est.webservice.coupon
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UseCoupon }
     * 
     */
    public UseCoupon createUseCoupon() {
        return new UseCoupon();
    }

    /**
     * Create an instance of {@link OffsetCouponResponse }
     * 
     */
    public OffsetCouponResponse createOffsetCouponResponse() {
        return new OffsetCouponResponse();
    }

    /**
     * Create an instance of {@link VarifyCoupon }
     * 
     */
    public VarifyCoupon createVarifyCoupon() {
        return new VarifyCoupon();
    }

    /**
     * Create an instance of {@link OffsetCoupon }
     * 
     */
    public OffsetCoupon createOffsetCoupon() {
        return new OffsetCoupon();
    }

    /**
     * Create an instance of {@link VarifyCouponResponse }
     * 
     */
    public VarifyCouponResponse createVarifyCouponResponse() {
        return new VarifyCouponResponse();
    }

    /**
     * Create an instance of {@link GetCouponListResponse }
     * 
     */
    public GetCouponListResponse createGetCouponListResponse() {
        return new GetCouponListResponse();
    }

    /**
     * Create an instance of {@link UseCouponResponse }
     * 
     */
    public UseCouponResponse createUseCouponResponse() {
        return new UseCouponResponse();
    }

    /**
     * Create an instance of {@link GetCouponList }
     * 
     */
    public GetCouponList createGetCouponList() {
        return new GetCouponList();
    }

    /**
     * Create an instance of {@link UseCouponResponseEntity }
     * 
     */
    public UseCouponResponseEntity createUseCouponResponseEntity() {
        return new UseCouponResponseEntity();
    }

    /**
     * Create an instance of {@link VerifyCouponVO }
     * 
     */
    public VerifyCouponVO createVerifyCouponVO() {
        return new VerifyCouponVO();
    }

    /**
     * Create an instance of {@link CouponVO }
     * 
     */
    public CouponVO createCouponVO() {
        return new CouponVO();
    }

    /**
     * Create an instance of {@link UseCouponVO }
     * 
     */
    public UseCouponVO createUseCouponVO() {
        return new UseCouponVO();
    }

    /**
     * Create an instance of {@link CouponVerifyResponse }
     * 
     */
    public CouponVerifyResponse createCouponVerifyResponse() {
        return new CouponVerifyResponse();
    }

    /**
     * Create an instance of {@link CouponListResponse }
     * 
     */
    public CouponListResponse createCouponListResponse() {
        return new CouponListResponse();
    }

    /**
     * Create an instance of {@link OffsetCouponResponseEntity }
     * 
     */
    public OffsetCouponResponseEntity createOffsetCouponResponseEntity() {
        return new OffsetCouponResponseEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffsetCouponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "offsetCouponResponse")
    public JAXBElement<OffsetCouponResponse> createOffsetCouponResponse(OffsetCouponResponse value) {
        return new JAXBElement<OffsetCouponResponse>(_OffsetCouponResponse_QNAME, OffsetCouponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "useCoupon")
    public JAXBElement<UseCoupon> createUseCoupon(UseCoupon value) {
        return new JAXBElement<UseCoupon>(_UseCoupon_QNAME, UseCoupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarifyCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "varifyCoupon")
    public JAXBElement<VarifyCoupon> createVarifyCoupon(VarifyCoupon value) {
        return new JAXBElement<VarifyCoupon>(_VarifyCoupon_QNAME, VarifyCoupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffsetCoupon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "offsetCoupon")
    public JAXBElement<OffsetCoupon> createOffsetCoupon(OffsetCoupon value) {
        return new JAXBElement<OffsetCoupon>(_OffsetCoupon_QNAME, OffsetCoupon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VarifyCouponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "varifyCouponResponse")
    public JAXBElement<VarifyCouponResponse> createVarifyCouponResponse(VarifyCouponResponse value) {
        return new JAXBElement<VarifyCouponResponse>(_VarifyCouponResponse_QNAME, VarifyCouponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouponListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "getCouponListResponse")
    public JAXBElement<GetCouponListResponse> createGetCouponListResponse(GetCouponListResponse value) {
        return new JAXBElement<GetCouponListResponse>(_GetCouponListResponse_QNAME, GetCouponListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UseCouponResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "useCouponResponse")
    public JAXBElement<UseCouponResponse> createUseCouponResponse(UseCouponResponse value) {
        return new JAXBElement<UseCouponResponse>(_UseCouponResponse_QNAME, UseCouponResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCouponList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://coupon.webService.est.yonyou.com/", name = "getCouponList")
    public JAXBElement<GetCouponList> createGetCouponList(GetCouponList value) {
        return new JAXBElement<GetCouponList>(_GetCouponList_QNAME, GetCouponList.class, null, value);
    }

}
