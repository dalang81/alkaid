package com.lilianinfo.cloud;

import com.lilianinfo.cloud.framework.service.core.ApplicationStarter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class UserServiceApplication {
	public static void main(String[] args) {
		ApplicationStarter.run(UserServiceApplication.class, args);
	}
}
