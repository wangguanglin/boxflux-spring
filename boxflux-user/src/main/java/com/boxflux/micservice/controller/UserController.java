package com.boxflux.micservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.boxflux.micservice.domain.User;
import com.boxflux.micservice.repository.UserRepository;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
public class UserController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private EurekaClient eurekaClient;
	
	private DiscoveryClient discoveryClient;
	
	@GetMapping("/user/{id}")
	public User findOne(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@GetMapping("/user")
	public List<User> get(){
		return userRepository.findAll(new Sort(Direction.ASC, "age"));
	}
	
	@GetMapping("/eureka-instance")
	public String serviceUrl() {
	    InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICSERVICE-USER", false);
	    return instance.getHomePageUrl();
	}
	
	@GetMapping("/instance-info")
	public ServiceInstance localServiceUrl() {
	    ServiceInstance instance = discoveryClient.getLocalServiceInstance();
	    return instance;
	}
}
