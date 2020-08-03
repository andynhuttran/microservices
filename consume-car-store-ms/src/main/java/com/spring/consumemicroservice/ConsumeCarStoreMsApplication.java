package com.spring.consumemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.spring.consumemicroservice")
@EnableDiscoveryClient
public class ConsumeCarStoreMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumeCarStoreMsApplication.class, args);
	}

}
