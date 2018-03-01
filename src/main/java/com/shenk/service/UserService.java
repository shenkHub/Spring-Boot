package com.shenk.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "userService", // 暴露服务名称
targetNamespace = "http://service.shenk.com/"// 命名空间,一般是接口的包名倒序
)
public interface UserService {
	@WebMethod
	@WebResult(name = "String", targetNamespace = "http://serviceImpl.shenk.com/")
	public String sayHello(@WebParam(name = "userName") String name);
}