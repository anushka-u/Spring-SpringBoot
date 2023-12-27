package com.spring;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =   SpringApplication.run(Application.class, args);
		
		PersonRepository personRepository = context.getBean(PersonRepository.class);
		
		PassportRepository passportRepository = context.getBean(PassportRepository.class);
		
//		Person person = new Person();
//		person.setPersonName("Ruhani");
//		person.setPersonGender("Female");
//		
//		Passport passport = new Passport();
//		passport.setPassportNumber("APJK345DES14");
//		passport.setIssuedDate(LocalDate.now());
//		passport.setExpiryDate(LocalDate.now().plusYears(10));
//		
//		person.setPassport(passport);
//		passport.setPerson(person);
//		
		//personRepository.save(person);
		
		
		//perRecordOptional.ifPresent(person->System.out.println(person));
		 
		 context.close();
	}

}
