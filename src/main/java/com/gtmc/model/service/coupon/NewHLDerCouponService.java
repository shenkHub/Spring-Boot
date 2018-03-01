package com.gtmc.model.service.coupon;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.gtmc.model.bean.input.coupon.NewHLDerCouponInput;
import com.gtmc.model.bean.output.coupon.NewHLDerCouponOutput;
/**
 * 全新汉兰达活动领券接口
 * @author Hoperun
 *
 */
@WebService(targetNamespace = "http://gtms.com/")
public interface NewHLDerCouponService {
    /**
     * 全新汉兰达活动啦领券
     * @param input
     * @return
     */
    @WebResult(name = "parmOutput")
    public NewHLDerCouponOutput getNewHLDerCoupon(@WebParam(name = "parmInput") NewHLDerCouponInput input);
}
