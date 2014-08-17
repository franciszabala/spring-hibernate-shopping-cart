package com.franciszabala.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciszabala.model.Product;
import com.franciszabala.repository.ProductRepository;
import com.franciszabala.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	@Autowired
	public void setProductRepository(
			ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#findAll()
	 */
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#find(java.lang.Long)
	 */
	@Override
	public Product find(int id) {
		return productRepository.find(id);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#create(com.sample.bank.model.AccountType)
	 */
	@Override
	public void create(Product item) {
		productRepository.create(item);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#update(com.sample.bank.model.AccountType)
	 */
	@Override
	public void update(Product item) {
		productRepository.update(item);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#delete(com.sample.bank.model.AccountType)
	 */
	@Override
	public void delete(Product item) {
		productRepository.delete(item);
	}
	
}
