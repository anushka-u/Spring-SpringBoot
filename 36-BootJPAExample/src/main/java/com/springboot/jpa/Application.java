package com.springboot.jpa;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.apache.catalina.authenticator.SpnegoAuthenticator.AcceptAction;
import org.apache.catalina.core.ApplicationContext;
import org.hibernate.query.results.implicit.ImplicitResultClassBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.jpa.dao.UserRepository;
import com.springboot.jpa.entity.User;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		user.setId(13);
//		user.setName("Anushka");
//		user.setCity("Rewa");
//		
//		User u1 = userRepository.save(user);
//		
//		
//		User user2 = new User(2,"Anus","Bhopal");
////		user.setCity("Bhopal");
////		user.setName("Anu");
//		
//		User user3 = new User(3,"Priya","Delhi");
////		user.setCity("Delhi");
////		user.setName("Raj");
////		
//		List<User> li = Arrays.asList(user2,user3);
//		
//	     List<User> user4 = (List<User>) userRepository.saveAll(li);
//	     
//	     System.out.println("Saved User");
//	     user4.forEach(System.out::println);
//	     
	    // userRepository.deleteAll();
		
//		Optional<User> optional = userRepository.findById(502);
//		User user = optional.get();
//		user.setName("Ankit");
//		
//		User resultUser = userRepository.save(user);
//		System.out.println(resultUser);
		
		Iterable<User> iterable = userRepository.findAll();
//		Iterator<User> iterator = iterable.iterator();
//		
//		while(iterator.hasNext())
//		{
//			User user2 = iterator.next();
//			System.out.println(user2);
//		}
		
		iterable.forEach(new Consumer<User>() {
			
			@Override
			public void accept(User t) {
				System.out.println(t);
			}
		});
		
		
		iterable.forEach(user-> System.out.println(user));
		
	}

}
