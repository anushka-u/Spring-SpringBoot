package com.jpa.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.springboot.Entity.Player;
import com.jpa.springboot.Repository.PlayerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
		PlayerRepository playerRepository = context.getBean(PlayerRepository.class);
		System.out.println(playerRepository.getClass().getName());
		
		Player p1 = new Player();
		p1.setId(101);
		p1.setPlayerName("Shami");
		p1.setPlayerAge("Thirty Five");
		p1.setLocation("India");
		
		playerRepository.save(p1);
		System.out.println(playerRepository.existsById(101));
		System.out.println(playerRepository.count());
		System.out.println();
		System.out.println("I am running");
		System.out.println(playerRepository.findAll());
		System.out.println("   ");
		playerRepository.deleteById(101);
		System.out.println(playerRepository.existsById(101));
		System.out.println(playerRepository.count());
		
	}

}
