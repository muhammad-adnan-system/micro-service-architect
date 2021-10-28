package com.system.api.zuul.cloud.gateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.system.api.zuul.cloud.gateway.filter.LoggingFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulCloudGatewayApplication {

	public static void main(String[] agrs) {
		SpringApplication.run(ZuulCloudGatewayApplication.class, agrs);
	}

	private static Logger log = LoggerFactory.getLogger(LoggingFilter.class);

	@Bean
	public ZuulFilter loggingFilter() {
		return new ZuulFilter() {

			@Override
			public boolean shouldFilter() {

				return true;
			}

			@Override
			public Object run() throws ZuulException {

				RequestContext ctx = RequestContext.getCurrentContext();
				HttpServletRequest request = ctx.getRequest();

				log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

				return null;
			}

			@Override
			public String filterType() {
				return "pre";
			}

			@Override
			public int filterOrder() {
				return 1;
			}

		};
	}
}
