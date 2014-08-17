package com.franciszabala.service;

import java.util.List;

import com.franciszabala.model.Product;

public interface ProductService {

	public abstract List<Product> findAll();

	public abstract Product find(int id);

	public abstract void create(Product item);

	public abstract void update(Product item);

	public abstract void delete(Product item);

}