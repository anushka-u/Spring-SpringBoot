package com.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{


}
