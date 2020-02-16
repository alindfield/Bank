package com.acme.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.acme.api"})
public class BankApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
	}

}