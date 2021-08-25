package com.rest.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.microservices.limitsservice.bean.Limits;
import com.rest.microservices.limitsservice.configuration.Configuration;

@RestController
public class LimitsController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retrieveLimts() {
	
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
		//	return new Limits(1,10000);
	}
}
