package com.jpa.springboot;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.springboot.entity.Product;
import com.jpa.springboot.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =SpringApplication.run(Application.class, args);
		ProductRepository repository = context.getBean(ProductRepository.class);
		Product p1 = new Product(1,"Sugar",2,66.00);
		Product p2 = new Product(2,"Salt",2,42.00);
		Product p3 = new Product(3,"TeaLeafs",1,120.00);
		
		repository.saveAll(Arrays.asList(p1,p2,p3));
		
		Iterable<Product> findAllById = repository.findAllById(Arrays.asList(1,2,3));
		findAllById.forEach(product->
		System.out.println(product));
	}

}
