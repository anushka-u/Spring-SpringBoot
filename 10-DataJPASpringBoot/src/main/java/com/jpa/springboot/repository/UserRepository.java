package com.jpa.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jpa.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	public List<User> findByCountry(String cname);
	//To find the user as who are 19
	public List<User> findByAge(int i);
	
	//To find user whose age are greater than integer i
	public List<User> findByAgeGreaterThanEqual(Integer age);
	
	public List<User> findByAgeIsBetween(Integer i, Integer j);
	
	public List<User> findByCountryAndAge(String country, Integer age);
}
