package com.spring.microservice.controllers;

import java.util.List;

import com.spring.microservice.object.Car;

public interface CarDAO {
	
	public List<Car> getAllCar();
}
