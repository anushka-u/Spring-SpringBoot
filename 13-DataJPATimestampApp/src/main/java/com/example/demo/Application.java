package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example.entity","com.example.repository"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product p = new Product();
		
		p.setPName("Monitor");
		p.setPrice(15000.00);
		
		Product p1  = new Product();
		p1.setPName("Mouse");
		p1.setPrice(500.00);
		
		
		 
		repository.saveAll(Arrays.asList(p,p1));
	}

}
