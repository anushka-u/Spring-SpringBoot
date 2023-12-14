package com.jpa.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.springboot.entity.Product;
import com.jpa.springboot.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	//Post Methods Below:_
	public Product saveProduct(Product product)
	{
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products)
	{
		return (List<Product>) repository.saveAll(products);
		
	}
	
	//Get Method
	public List<Product> getProducts(){
		return (List<Product>) repository.findAll();
	}
	
	public Product getProduct(int id)
	{
		return repository.findById(id).orElse(null);
	}
	
}
