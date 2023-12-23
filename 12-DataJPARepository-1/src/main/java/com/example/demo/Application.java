package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.query.Page;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		UserRepository repository = context.getBean(UserRepository.class);
		User u5 = new User(5,"Rajni","FeMale",18,"India");
		User u6 = new User(6,"Rashmi","Female",19,"USA");
		User u7 = new User(7,"Ramesh","Male",21,"India");
		User u8 = new User(8,"Ratnesh","Male",19,"California");
		User u9 = new User(9,"Rajneesh","Male",24,"Canada");
		User u10 = new User(10,"Rishika","Male",23,"UK");
		
		repository.saveAll(Arrays.asList(u5,u6,u7,u8,u9,u10));
		
		//To retrieve all records
		List<User>users = repository.findAll();		
		
System.out.println("________________________________________________________");
		
		//findAll() is overloaded in JPA repository so to perform orderby age, by default it sort the data in ascending order
		users = repository.findAll(Sort.by("age"));
		users.forEach(user -> System.out.println(user));
		
		System.out.println("_____________________IN DESCENDING ORDER__________________________________________");
		users = repository.findAll(Sort.by("age").descending());
		users.forEach(user -> System.out.println(user));
		
		
		System.out.println("____________________BY NAME ______________________________");
		users = repository.findAll(Sort.by("userName"));
		users.forEach(user -> System.out.println(user));
		
		int pageSize = 3;
		int pageNumber = 0;
		//Pagination 
		System.out.println("________________________PAGINATION____________________________");
		PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		org.springframework.data.domain.Page<User> pageData = repository.findAll(pageRequest);
		//Total Pages
		int totalPage = pageData.getTotalPages();
		System.out.println("Total Pages :: "+ totalPage);
		List<User> users2 = pageData.getContent();
		users2.forEach(user -> System.out.println(user));
		
		
		System.out.println();
		System.out.println("_________________QUERY BY EXAMPLE________________________________________");
		//QBE - Query By Example
		User entityUser = new User();
		//Optional (set if required)
		entityUser.setCountry("India");
		Example<User> example = Example.of(entityUser);
		List<User> users3 = repository.findAll(example);
		
		users3.forEach(user -> System.out.println(user));
		
		//findAll() is overloaded method
		System.out.println("findAll() overloaded method");
		
		
		
		
		
	}

}
