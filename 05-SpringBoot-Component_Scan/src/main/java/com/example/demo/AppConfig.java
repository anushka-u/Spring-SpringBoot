package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig::Constructor");
	}
	
	@Bean
	public AppSecurity createInstance() {
		AppSecurity as = new AppSecurity();
		//Custom logic to serve functionality
		return as;
	}

}
