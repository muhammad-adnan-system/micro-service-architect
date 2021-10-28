package com.system.api.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product-service")
public class ProductInfoController {
	
	
	@GetMapping("/info")
	public String test() {
		return "<h3>Hello World This is</h3><h1> Product service</h1>";
	}
}
