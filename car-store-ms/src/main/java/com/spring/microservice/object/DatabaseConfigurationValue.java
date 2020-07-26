package com.spring.microservice.object;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConfigurationValue {
	
	@Value("${my-app.database.host}")
	private String host;
	
	@Value("${my-app.database.uid}")
	private String uid;
	
	@Value("${my-app.database.pwd}")
	private String pwd;
	
	
	private String title;
	
	public DatabaseConfigurationValue() {
		this.title = DatabaseConfigurationValue.class.getName();
	}
	
	
	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String getUid() {
		return uid;
	}
	
	public void setUid(String uid) {
		this.uid = uid;
	}
	
	public String getPwd() {
		return pwd;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getTitle() {
		return title;
	}
	
}
