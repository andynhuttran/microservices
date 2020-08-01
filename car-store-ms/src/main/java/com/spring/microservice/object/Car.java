package com.spring.microservice.object;

public class Car {

	private String name;
	private String model;
	private double price;
	private String host;
	private DatabaseConfigurationValue databaseConfigurationValue;
	
	public Car(String name, String model, double price, DatabaseConfigurationValue databaseConfigurationValue) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
		this.databaseConfigurationValue = databaseConfigurationValue;
		
		this.host = null;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}


	public DatabaseConfigurationValue getDatabaseConfigurationValue() {
		return databaseConfigurationValue;
	}


	public void setDatabaseConfigurationValue(DatabaseConfigurationValue databaseConfigurationValue) {
		this.databaseConfigurationValue = databaseConfigurationValue;
	}
	
	
	
	
	
}
