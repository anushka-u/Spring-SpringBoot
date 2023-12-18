package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



//@SpringBootApplication
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ConfigurableApplicationContext  context = SpringApplication.run(Application.class, args);
		StudentRepository repository = context.getBean(StudentRepository.class);
		
//		Student s1 = new Student(1,"Aashish","cse",21);
//		Student s2 = new Student(2,"Rupa","Ec",20);
//		Student s3 = new Student(3,"Kusum","ME",19);
//		Student s4 = new Student(4,"karuna","cse",22);
//		
//		repository.saveAll(Arrays.asList(s1,s2,s3,s4));
		
		//calling HQL method to retrieve all record
		List<Student> students = repository.getAllStudentHql();
		students.forEach(student -> System.out.println(student));
		
		System.out.println("___________________________________________________________");
		// calling Native-sql query method
		 students = repository.getAllStudentSql();
		students.forEach(student -> System.out.println(student));
		
		System.out.println("______________________________________________________________");
		students =repository.getAllStudentByCourse("cse");
		students.forEach(student -> System.out.println(student));
		
		students = repository.getAllStudentByCourseAndAge("cse", 21);
		students.forEach(student -> System.out.println(student));
	}

}
