package com.system.api.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaClientApplication {

	public static void main(String[] agrs) {
		SpringApplication.run(EurekaClientApplication.class, agrs);
	}

}
