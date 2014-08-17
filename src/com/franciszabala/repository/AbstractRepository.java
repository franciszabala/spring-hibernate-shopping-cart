package com.franciszabala.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
/*
 * Contains default implementation of basic CRUD functions and to be subclassed for specific class
 */
public class AbstractRepository<T> implements Repository<T> {

	protected final Class<T> modelClass;
	
	protected SessionFactory sessionFactory;
	
	protected AbstractRepository(Class<T> modelClass){
		this.modelClass = modelClass;
	}
	
	@Autowired
	public final void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(){
		Criteria criteria = sessionFactory.getCurrentSession()
				.createCriteria(this.modelClass);
		
		return (List<T>) criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T find(int id){
		return (T) sessionFactory.getCurrentSession()
				.get(this.modelClass, id);
	}
	
	@Override
	public void create(T item){
		sessionFactory.getCurrentSession().save(item);
	}
	
	@Override
	public void update(T item){
		sessionFactory.getCurrentSession().update(item);
	}
	
	@Override
	public void delete(T item){
		sessionFactory.getCurrentSession().delete(item);
	}
	
}
