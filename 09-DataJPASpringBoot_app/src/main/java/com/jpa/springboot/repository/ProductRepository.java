package com.jpa.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.springboot.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer>{

}
