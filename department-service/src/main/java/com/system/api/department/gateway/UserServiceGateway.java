package com.system.api.department.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(name="USER-SERVICE")
public interface UserServiceGateway {
	
	
	@GetMapping("/user-service/info")
    public String getUserInfo();

}
