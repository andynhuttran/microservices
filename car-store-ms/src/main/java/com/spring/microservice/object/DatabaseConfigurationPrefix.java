package com.spring.microservice.object;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my-app.database")
public class DatabaseConfigurationPrefix {

	private String host;
	private String uid;
	private String pwd;
	private String title;
	
	public DatabaseConfigurationPrefix() {
		this.title = DatabaseConfigurationPrefix.class.getName();
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
