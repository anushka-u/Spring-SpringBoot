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
	
		User u1 = new User(1,"Ram","Male",18,"India");
		User u2 = new User(2,"Ramya","Female",19,"India");
		User u3 = new User(3,"Ramu","Male",21,"India");
		User u4 = new User(4,"Ramakant","Male",19,"India");
		
		repository.saveAll(Arrays.asList(u1,u2,u3,u4));
		
		System.out.println("_________________________________________________________");
		Optional<User> findById = repository.findById(1);
		findById.ifPresent(user->System.out.println(user));
		
		System.out.println(" ______________________________________________");
		Iterable<User> findAllById = repository.findAllById(Arrays.asList(1,2,3,4));
		findAllById.forEach(user->
		System.out.println(user));
		
		//To retrieve those user who are from USA.
		List<User> findbycountry = repository.findByCountry("USA");
		findbycountry.forEach(user -> System.out.println(user));
		
		//To retrieve users whose age is 19
		List<User> findbyage =  repository.findByAge(19);
		findbyage.forEach(user -> System.out.println(user));
		
		//To retrieve users whose age are greater than value passes in parameter
		List<User>  findbyagegreaterorequal =  repository.findByAgeGreaterThanEqual(20);
		findbyagegreaterorequal.forEach(user -> System.out.println(user));
		
		//To retrieve those users whose age lie in between integer i and integer j
		List<User> findbyageinbetweenList =  repository.findByAgeIsBetween(18, 20);
		findbyageinbetweenList.forEach(user -> System.out.println(user));
		
		//To retrieve those users who are from the country passed in parameter and in age of parameter
		List<User> findbycountryandfindbyage = repository.findByCountryAndAge("India",21);
		findbycountryandfindbyage.forEach(user -> System.out.println(user));
		
		//To retieve users whose country,age and gender matches with parameters
		List<User> findbycag = repository.findByCountryAndAgeAndGender("India", 19, "Male");
		findbycag.forEach(user -> System.out.println(user));
	}

}
