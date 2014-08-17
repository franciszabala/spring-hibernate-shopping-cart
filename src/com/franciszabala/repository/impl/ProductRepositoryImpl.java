package com.franciszabala.repository.impl;

import org.springframework.stereotype.Repository;

import com.franciszabala.model.Product;
import com.franciszabala.repository.AbstractRepository;
import com.franciszabala.repository.ProductRepository;

@Repository
public class ProductRepositoryImpl 
	extends AbstractRepository<Product>
	implements ProductRepository{

	
	public ProductRepositoryImpl(){
		super(Product.class);
	}
}
