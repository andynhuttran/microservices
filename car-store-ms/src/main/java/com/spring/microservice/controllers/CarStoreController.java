package com.spring.microservice.controllers;

import java.util.List;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.microservice.object.Car;
import com.spring.microservice.object.DatabaseConfigurationPrefix;
import com.spring.microservice.object.DatabaseConfigurationValue;

@RestController
public class CarStoreController {

	
	@Autowired
	private DatabaseConfigurationPrefix databaseConfigurationPrefix; 
	
	@Autowired
	private DatabaseConfigurationValue databaseConfigurationValue; 
	
	
	@Autowired
	private CarDAO carDAO;
	
	
	@GetMapping("/configurations-prefix")
	public DatabaseConfigurationPrefix getConfigurationPrefix() {
		return databaseConfigurationPrefix;
	}
	
	@GetMapping("/configurations-value")
	public DatabaseConfigurationValue getConfigurationValue() {
		return databaseConfigurationValue;
	}
	
	
	@GetMapping("/cars")
	public List<Car> getCars() {
		List<Car> cars = carDAO.getAllCar();
		
		cars.forEach(c -> {
			c.setDatabaseConfigurationValue(databaseConfigurationValue);
			c.setHost(databaseConfigurationValue.getHost());
		});
		
		return cars;
	}
	
	
	@GetMapping("/cars/from/{from}/to/{to}")
	public List<Car> getCarsByPrice(@PathVariable("from") double from, @PathVariable("to") double to) {
		List<Car> cars = carDAO.getAllCar();
		cars.forEach(c -> {
			c.setDatabaseConfigurationValue(databaseConfigurationValue);
			c.setHost(databaseConfigurationValue.getHost());
		});
		
		List<Car> list = cars.stream().filter(new Predicate<Car>() {
			@Override
			public boolean test(Car c) {
				if (from <= c.getPrice() && c.getPrice() <= to) {
					return true;
				}
				return false;
			}
		}).collect(Collectors.toList());

		return list;
	}
	
	
	
	
}
