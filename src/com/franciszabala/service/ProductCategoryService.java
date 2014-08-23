package com.franciszabala.service;

import java.util.List;

import com.franciszabala.model.ProductCategory;

public interface ProductCategoryService {
	public abstract List<ProductCategory> findAll();

	public abstract ProductCategory find(int id);

	public abstract void create(ProductCategory item);

	public abstract void update(ProductCategory item);

	public abstract void delete(ProductCategory item);
}
