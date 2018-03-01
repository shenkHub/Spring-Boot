package com.gtmc.config;

import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gtmc.model.service.coupon.NewHLDerCouponService;

@Configuration
public class EnConfig {
	@Bean
	public ServletRegistrationBean dispatcherServlet() {
		return new ServletRegistrationBean(new CXFServlet(), "/gtms-ap/ap/*");
	}

	@Autowired
	private Bus bus;

	// @Autowired
	// UserService userService;
	@Autowired
	NewHLDerCouponService newHLDerCouponService;
//	@Autowired
//	CouponInfoService couponInfoService;
//	@Autowired
//	TactSrvOrderValiInfoService tactSrvOrderValiInfoService;

	// @Autowired
	// TactSrvOrderValiInfoService tactSrvOrderValiInfoService;
	/** JAX-WS **/
	// @Bean
	// public Endpoint endpoint() {
	// EndpointImpl endpoint = new EndpointImpl(bus, userService);
	// endpoint.publish("/userService");
	// return endpoint;
	// }
	@Bean
	public Endpoint newHLDerCouponService() {
		EndpointImpl endpoint = new EndpointImpl(bus, newHLDerCouponService);
		endpoint.publish("/getNewHLDerCoupon");
		return endpoint;
	}
	//
	// @Bean
	// public Endpoint couponInfoService() {
	// EndpointImpl endpoint = new EndpointImpl(bus, couponInfoService);
	// endpoint.publish("/couponInfoService");
	// return endpoint;
	// }

	// @Bean
	// public Server rsServer() {
	// JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
	//// JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
	//// factory.setBus(bus);
	//// factory.setProviders(Arrays.asList(new
	//// TactSrvOrderValiInfoServiceImpl()));
	//// factory.setResourceClasses(TactSrvOrderValiInfoService.class);
	//// factory.setAddress("/rest");
	//// return factory.create();
	// endpoint.setBus(bus);
	// endpoint.setAddress("/setSrvOrderTempInfo");
	// // Register 2 JAX-RS root resources supporting "/sayHello/{id}" and
	// // "/sayHello2/{id}" relative paths
	// endpoint.setServiceBeans(Arrays.<Object> asList(new
	// TactSrvOrderValiInfoServiceImpl()));
	// Map<Object, Object> map=new HashMap<>();
	// map.put("json", "application/json");
	// endpoint.setExtensionMappings(map);
	//// endpoint.setFeatures(features2);
	// return endpoint.create();
	// }
	// <bean id="tactSrvOrderInfoServiceImpl"
	// class="com.gtmc.model.service.impl.maintenance.TactSrvOrderInfoServiceImpl"
	// />
	// <jaxrs:server id="tactSrvOrderInfoService"
	// address="/tactSrvOrderInfoService">
	// <jaxrs:serviceBeans>
	// <ref bean="tactSrvOrderInfoServiceImpl" />
	// </jaxrs:serviceBeans>
	// <jaxrs:extensionMappings>
	// <entry key="json" value="application/json" />
	// </jaxrs:extensionMappings>
	// </jaxrs:server>

	// // @Bean
	// // public Endpoint tactSrvOrderValiInfoService() {
	// // EndpointImpl endpoint = new EndpointImpl(bus,
	// // tactSrvOrderValiInfoService);
	// // endpoint.publish("/tactSrvOrderValiInfoService");
	// // return endpoint;
	// // }
	// @Bean
	// public Server rsServer() {
	// // JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
	// // endpoint.setBus(bus);
	// // endpoint.setAddress("/setSrvOrderTempInfo");
	// // endpoint.setServiceBeans(Arrays.<Object>
	// // asList(tactSrvOrderValiInfoService));
	// // endpoint.setProviders(Arrays.asList(jacksonJaxbJsonProvider(),
	// // jaxbElementProvider()));
	// // endpoint.setFeatures(features2);
	// JAXRSServerFactoryBean sf = new JAXRSServerFactoryBean();
	// sf.setBus(bus);
	// sf.setResourceClasses(TactSrvOrderValiInfoServiceImpl.class);
	// sf.setBindingId(JAXRSBindingFactory.JAXRS_BINDING_ID);
	// sf.setServiceBeans(Arrays.<Object>
	// asList(tactSrvOrderValiInfoService));
	// sf.setAddress("/test");
	// sf.setDocLocation("com.gtmc.model.service.impl.maintenance.TactSrvOrderInfoServiceImpl");
	// // Server myServer = sf.create();
	// return sf.create();
	// }

	// @Bean
	// public JacksonJaxbJsonProvider jacksonJaxbJsonProvider() {
	// return new JacksonJaxbJsonProvider();
	// }
	// @Bean
	// public JAXBElementProvider jaxbElementProvider() {
	// return new JAXBElementProvider();
	// }

}
