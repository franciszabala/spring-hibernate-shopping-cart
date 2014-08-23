package com.franciszabala.repository.impl;

import org.springframework.stereotype.Repository;

import com.franciszabala.model.ProductCategory;
import com.franciszabala.repository.AbstractRepository;
import com.franciszabala.repository.ProductCategoryRepository;

@Repository
public class ProductCategoryRepositoryImpl 
	extends AbstractRepository<ProductCategory>
	implements ProductCategoryRepository{

	
	public ProductCategoryRepositoryImpl(){
		super(ProductCategory.class);
	}
}
