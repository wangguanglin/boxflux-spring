package com.boxflux.micservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.boxflux.RandomRuleConfiguration;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "boxflux-user", configuration = RandomRuleConfiguration.class)
public class MovieApplication {
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
