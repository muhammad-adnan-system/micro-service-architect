package com.system.api.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-service")
public class UserInfoController {
	
	
	@GetMapping("/info")
	public String test() {
		return "<h3>Hello World This is </h3><h1>User service<h1/>";
	}
}
