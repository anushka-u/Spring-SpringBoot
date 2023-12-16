package com.jpa.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "USER_MASTER")
//when we use @data annotation we don't need to write getter and setter
@Data 
@ToString
public class User {
	
	@Id
	@Column(name="USERID")
	private Integer userId;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name ="GENDER")
	private String gender;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "COUNTRY")
	private String country;
	
	public User() {
		
	}
	
	public User(Integer userId, String userName, String gender, Integer age, String country) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}

	
}
