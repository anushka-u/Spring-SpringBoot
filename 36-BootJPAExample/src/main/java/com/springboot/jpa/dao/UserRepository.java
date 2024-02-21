package com.springboot.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByNameAndCity(String s1, String s2);

}
