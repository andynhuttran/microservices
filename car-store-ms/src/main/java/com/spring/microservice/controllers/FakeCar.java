package com.spring.microservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.microservice.object.Car;

@Repository
public class FakeCar implements CarDAO {

	List<Car> cars = new ArrayList<Car>();
	
	public FakeCar() {
		cars.add(new Car("Car 1", "Car model 1", 1, null));
		cars.add(new Car("Car 2", "Car model 2", 2, null));
		cars.add(new Car("Car 3", "Car model 3", 3, null));
		cars.add(new Car("Car 4", "Car model 4", 4, null));
	}
	
	
	@Override
	public List<Car> getAllCar() {
		return cars;
	}

}
