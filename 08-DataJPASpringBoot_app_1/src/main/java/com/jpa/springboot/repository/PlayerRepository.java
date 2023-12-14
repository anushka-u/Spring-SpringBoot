package com.jpa.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.jpa.springboot.Entity1.Player;


public interface PlayerRepository extends CrudRepository<Player,Integer> {

}
