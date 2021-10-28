package com.system.api.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.api.department.gateway.UserServiceGateway;

@RestController
@RequestMapping("/department-service")
public class DepartmentInfoController {

	@Autowired
	private UserServiceGateway userServiceGateway;

	@GetMapping("/info")
	public String info() {
		return "<h3>Hello World This is</h3><h1> Department service</h1>";
	}

	@GetMapping("/user/info")
	public String userInfo() {
		return userServiceGateway.getUserInfo();
	}
}
