package com.jpa.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
