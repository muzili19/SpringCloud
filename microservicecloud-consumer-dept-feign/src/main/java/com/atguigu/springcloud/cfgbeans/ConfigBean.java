package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean
{
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
//	
//	@Bean
//	public IRule myRule()
//	{
//		return new RetryRule();  //List list = new ArrayList();
//	}
//	
}

/*
 * applicationContext.xml 
 * <bean id="userService" class="com.atguigu.UserServiceImpl">
 * <bean id="userService" class="com.atguigu.UserServiceImpl2">
 * 
 * 
 * springboot开始后，推荐用注解替代xml
 * 
 * @Configuration+ConfigBean ==applicationContext.xml
 * 
 */