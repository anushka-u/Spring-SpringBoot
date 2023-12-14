package com.jpa.springboot.Repository;
import org.springframework.data.repository.CrudRepository;

import com.jpa.springboot.Entity.Player;
public interface PlayerRepository extends CrudRepository<Player,Integer> {

}
