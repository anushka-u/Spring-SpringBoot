package com.jpa.springboot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.springboot.entity.User;
import com.jpa.springboot.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
	
		User u1 = new User(1,"Ram","Male",19,"India");
		User u2 = new User(2,"Ramya","Female",19,"India");
		User u3 = new User(3,"Ramu","Male",19,"India");
		User u4 = new User(4,"Ramakant","Male",19,"India");
		
		repository.saveAll(Arrays.asList(u2,u3,u4));
		
		//Optional<User> findById = repository.findById(1);
		Iterable<User> findAllById = repository.findAllById(Arrays.asList(1,2,3,4));
		findAllById.forEach(user->
		System.out.println(user));
		
		
		List<User> findbycountry = repository.findByCountry("USA");
		
		findbycountry.forEach(user -> System.out.println(user));
		
	}

}
