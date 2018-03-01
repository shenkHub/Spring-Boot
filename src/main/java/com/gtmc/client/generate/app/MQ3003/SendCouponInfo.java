package com.gtmc.client.generate.app.MQ3003;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.gtmc.base.db.ServiceControl;
import com.gtmc.common.macrodef.GtmcConst.ResourceFile;
import com.gtmc.model.bean.input.coupon.SaveCouponContentEip2appInput;
import com.gtmc.util.DateUtil;
import com.gtmc.util.MD5Util;
import com.gtmc.util.PropertyUtil;
import com.gtmc.util.RandomUtil;
import com.gtmc.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class SendCouponInfo {
	/** 日志对象 */
	private static Logger logger = LoggerFactory.getLogger(SendCouponInfo.class);

	public static final String APP_URL = PropertyUtil.getValueByKey(ResourceFile.SERVICE_URL,
			ResourceFile.URL_gerEmployee);

	public static String sendPost(ServiceControl control, SaveCouponContentEip2appInput input) {
		logger.info("iclub电商优惠券同步开始。 优惠券号=" + input.getCOUPON_ID() +  "  手机号码=" + input.getPHONE());
		String result = "";
		try {
				// 参数设定
				String coupon_id = StringUtil.valueOf(input.getCOUPON_ID());
				String batch_id = StringUtil.valueOf(input.getBATCH_ID());
				String phone = StringUtil.valueOf(input.getPHONE());
				String bc_id = StringUtil.valueOf(input.getBC_ID());
				String tc_id = StringUtil.valueOf(input.getTC_ID());
				String coupon_name = StringUtil.valueOf(input.getCOUPON_NAME());
				String coupon_remark = StringUtil.valueOf(input.getCOUPON_REMARK());
				String copyright = StringUtil.valueOf(input.getCOPYRIGHT());
				String status = StringUtil.valueOf(input.getSTATUS());
				String grant_type = StringUtil.valueOf(input.getGRANT_TYPE());
				String coupon_cost = StringUtil.valueOf(input.getCOUPON_COST());
				String coupon_count = StringUtil.valueOf(input.getCOUPON_COUNT());
				String coupon_amount = StringUtil.valueOf(input.getCOUPON_AMOUNT());
				String coupon_issuer = StringUtil.valueOf(input.getCOUPON_ISSUER());
				String from_application = StringUtil.valueOf(input.getFROM_APPLICATION());
				String conpon_use_remark = StringUtil.valueOf(input.getCONPON_USE_REMARK());
				String coupon_type = StringUtil.valueOf(input.getCOUPON_TYPE());
				String coupon_begin = StringUtil.valueOf(input.getCOUPON_BEGIN());
				String coupon_end = StringUtil.valueOf(input.getCOUPON_END());
				String coupon_status = StringUtil.valueOf(input.getCOUPON_STATUS());
				String publish_date = StringUtil.valueOf(input.getPUBLISH_DATE());
				String useing_date = StringUtil.valueOf(input.getUSEING_DATE());
				String useed_date = StringUtil.valueOf(input.getUSEED_DATE());
				String order_id = StringUtil.valueOf(input.getORDER_ID());
				String dealer_code = StringUtil.valueOf(input.getDEALER_CODE());
				String create_by = "1";
				String update_by = "1";
				//add by zhang_lei 20170508 电商优惠券同步功能增加 start
				if (StringUtil.valueOf(input.getBATCH_ID()).equals("DS000000000000000000") || coupon_id.length() == 9){
					 create_by = "3";
					 update_by = "";
				} 
				//add by zhang_lei 20170508 电商优惠券同步功能增加 end
				String coupon_introduction = StringUtil.valueOf(input.getCOUPON_INTRODUCTION());
				String third_party_url = StringUtil.valueOf(input.getTHIRD_PARTY_URL());
				String third_party_id = StringUtil.valueOf(input.getTHIRD_PARTY_ID());
				String coupon_pwd = StringUtil.valueOf(input.getCOUPON_PWD());
				String coupon_phone = StringUtil.valueOf(input.getCOUPON_PHONE());
				Date date = new Date();
				SimpleDateFormat format = new SimpleDateFormat(DateUtil.FORMAT_DATE_TIME_10);
				String timeSpan = format.format(date);
				logger.info("iclub电商优惠券同步：优惠券号：" + coupon_id + 
							" 优惠券批次编号：" + batch_id +
							" 手机号码：" + phone +
							" 业务场景编号：" + bc_id +
							" 触发条件编号：" + tc_id +
							" 优惠券名称：" + coupon_name +
							" 优惠券说明：" + coupon_remark +
							" 优惠券版权：" + copyright +
							" 发放状态：" + status +
							" 发放类型：" + grant_type +
							" 券面金额：" + coupon_cost +
							" 数量：" + coupon_count +
							" 总额：" + coupon_amount +
							" 发行方：" + coupon_issuer +
							" 来源系统：" + from_application +
							" 优惠券使用规则说明：" + conpon_use_remark +
							" 优惠券类型：" + coupon_type +
							" 优惠券有效期开始时间：" + coupon_begin +
							" 优惠券有效期结束时间：" + coupon_end +
							" 优惠券状态：" + coupon_status +
							" 领取时间：" + publish_date +
							" 使用时间：" + useing_date +
							" 核销时间：" + useed_date +
							" 绑定工单：" + order_id +
							" 核销销售店代码：" + dealer_code +
							" 创建者：" + create_by +
							" 更新者：" + update_by +
							" 优惠券简介：" + coupon_introduction +
							" 第三方优惠券url：" + third_party_url +
							" 第三方券号：" + third_party_id +
							" 优惠券密码：" + coupon_pwd +
							" 优惠券客服热线：" + coupon_phone );
				// 系统参数【数字签名】取得
				String appkey = "d6b47e30-2f81-4573-bf91-ba31564e983a";
				Long occurtime = new Date().getTime();
				String nonce = RandomUtil.getNumRandom(4);
				StringBuffer sign = new StringBuffer();
				sign.append(appkey).append(nonce).append(occurtime);
				// 消息发送API：
				StringBuffer urlSb = new StringBuffer();
				urlSb.append(APP_URL).append("channel=").append("eip.couponInfo.sync").append("&").append("appid=")
						.append("10001").append("&").append("nonce=").append(nonce).append("&").append("occurtime=")
						.append(occurtime.toString()).append("&").append("sign=")
						.append(MD5Util.stringToMD5(sign.toString()));
				logger.info("iclub电商优惠券同步URL:" + urlSb.toString());

				// 创建连接
				URL url = new URL(urlSb.toString());
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				logger.info("创建链接成功：" + conn.getURL());
				conn.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
				conn.setDoOutput(true);
				conn.setDoInput(true);
				conn.setRequestMethod("POST");
				conn.setUseCaches(false);
				conn.setInstanceFollowRedirects(true);
				conn.connect();
				logger.info("获取链接成功。");
				DataOutputStream out = new DataOutputStream(conn.getOutputStream());
				JSONObject obj = new JSONObject();
				obj.element("COUPON_ID", coupon_id );
				obj.element("BATCH_ID", batch_id );
				obj.element("PHONE", phone );
				obj.element("BC_ID", bc_id );
				obj.element("TC_ID", tc_id );
				obj.element("COUPON_NAME", coupon_name );
				obj.element("COUPON_REMARK", coupon_remark );
				obj.element("COPYRIGHT", copyright );
				obj.element("STATUS", status );
				obj.element("GRANT_TYPE", grant_type );
				obj.element("COUPON_COST", coupon_cost );
				obj.element("COUPON_COUNT", coupon_count );
				obj.element("COUPON_AMOUNT", coupon_amount );
				obj.element("COUPON_ISSUER", coupon_issuer );
				obj.element("FROM_APPLICATION", from_application );
				obj.element("CONPON_USE_REMARK", conpon_use_remark );
				obj.element("COUPON_TYPE", coupon_type );
				obj.element("COUPON_BEGIN", coupon_begin );
				obj.element("COUPON_END", coupon_end );
				obj.element("COUPON_STATUS", coupon_status );
				obj.element("PUBLISH_DATE", publish_date );
				obj.element("USEING_DATE", useing_date );
				obj.element("USEED_DATE", useed_date );
				obj.element("ORDER_ID", order_id );
				obj.element("DEALER_CODE", dealer_code );
				obj.element("CREATE_BY", create_by );
				obj.element("UPDATE_BY", update_by );
				obj.element("COUPON_INTRODUCTION", coupon_introduction );
				obj.element("THIRD_PARTY_URL", third_party_url );
				obj.element("THIRD_PARTY_ID", third_party_id );
				obj.element("COUPON_PWD", coupon_pwd );
				obj.element("COUPON_PHONE", coupon_phone );
				obj.element("timeSpan", timeSpan);
				out.write(obj.toString().getBytes("UTF-8"));
				logger.info("数据写入成功：" + obj.toString());
				out.flush();
				// 读取响应
				JSONObject objOrder = new JSONObject();
				BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
				String lines;
				StringBuffer sb = new StringBuffer("");
				while ((lines = reader.readLine()) != null) {
					lines = new String(lines.getBytes());
					sb.append(lines);
				}
				JSONArray array = JSONArray.fromObject(sb.toString());
				Object[] o = array.toArray();
				objOrder = JSONObject.fromObject(o[0]);
				logger.info("iclub电商优惠券同步返回结果:" + objOrder.toString());
				result = StringUtil.valueOf(objOrder.get("result"));
				out.close();
				conn.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("iclub电商优惠券同步:系统异常。 优惠券号=" + input.getCOUPON_ID() +  "  手机号码=" + input.getPHONE() );
			logger.error("出错原因:" + e.getMessage());
			logger.error("出错位置:" + Arrays.toString(e.getStackTrace()));
		}
		logger.info("iclub电商优惠券同步结束。 优惠券号=" + input.getCOUPON_ID() +  "  手机号码=" + input.getPHONE() );
		return result;
	}
}
