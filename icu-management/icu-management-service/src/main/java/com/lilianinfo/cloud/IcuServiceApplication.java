package com.lilianinfo.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import com.lilianinfo.cloud.framework.service.core.ApplicationStarter;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class IcuServiceApplication {
	public static void main(String[] args) {
		ApplicationStarter.run(IcuServiceApplication.class, args);
	}
}
