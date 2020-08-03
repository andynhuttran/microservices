package com.spring.consumemicroservice.controllers;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "database-config") //name of car store service
@RibbonClient(name = "database-config") //name of car store service
public interface CarStoreProxy {
	
	@GetMapping("/cars")
	public List<CarStore> findAll();
	
	@GetMapping("/cars/from/{from}/to/{to}")
	public List<CarStore> getCarsByPrice(@PathVariable("from") double from, @PathVariable("to") double to);
}
