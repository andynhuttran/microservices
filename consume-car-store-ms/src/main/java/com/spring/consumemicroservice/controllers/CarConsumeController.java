package com.spring.consumemicroservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarConsumeController {

	@Autowired
	private CarStoreProxy carStoreProxy;
	
	
	@GetMapping("/cars")
	public List<CarStore> getCars(){
		return carStoreProxy.findAll();
	}
	
	
	@GetMapping("/cars/{from}/{to}")
	public List<CarStore> getCars(@PathVariable("from") double from, @PathVariable("to") double to){
		return carStoreProxy.getCarsByPrice(from, to);
	}
	
	
}
