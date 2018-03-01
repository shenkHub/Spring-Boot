package com.shenk.serviceImpl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.shenk.service.UserService;

@WebService(serviceName = "userService", targetNamespace = "http://serviceImpl.shenk.com/", endpointInterface = "com.shenk.service.UserService")
@Component
public class UserServiceImpl implements UserService {

	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "111";
	}

}
