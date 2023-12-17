package com.example.demo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Component
@Entity
@Table(name = "Student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String course;
	private Integer age;
		

}
