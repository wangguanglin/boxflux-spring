package com.boxflux.micservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.boxflux.micservice.domain.User;

@RestController
public class MovieController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id){
		return restTemplate.getForObject("http://micservice-user:7900/user/"+id, User.class);
	}
}
