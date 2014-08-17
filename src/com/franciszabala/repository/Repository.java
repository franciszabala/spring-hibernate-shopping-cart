package com.franciszabala.repository;

import java.util.List;

public interface Repository<T> {

	List<T> findAll();
	
	T find(int id); //assume all model ids are Long type
	
	void create(T item);
	
	void update(T item);
	
	void delete(T item);
	
}
