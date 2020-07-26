package com.spring.microservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.object.DatabaseConfigurationPrefix;
import com.spring.microservice.object.DatabaseConfigurationValue;

@RestController
public class CarStoreController {

	
	@Autowired
	private DatabaseConfigurationPrefix databaseConfigurationPrefix; 
	
	@Autowired
	private DatabaseConfigurationValue DatabaseConfigurationValue; 
	
	
	@GetMapping("configurations-prefix")
	public DatabaseConfigurationPrefix getConfigurationPrefix() {
		return databaseConfigurationPrefix;
	}
	
	@GetMapping("configurations-value")
	public DatabaseConfigurationValue getConfigurationValue() {
		return DatabaseConfigurationValue;
	}
}
