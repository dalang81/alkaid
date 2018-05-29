package com.lilianinfo.cloud.framework.service.core.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableHystrix
@EnableFeignClients(basePackages={"com.lilianinfo.cloud.**.feign.**","com.lilianinfo.cloud.**.api.**"})
@Import({DiscoveryClientConfig.class,ScheduledTaskConfig.class,SwaggerConfig.class,CacheConfig.class})
public class CoreConfig {

}
