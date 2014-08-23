package com.franciszabala.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.franciszabala.model.ProductCategory;
import com.franciszabala.repository.ProductCategoryRepository;
import com.franciszabala.service.ProductCategoryService;

@Service
@Transactional
public class ProductCategoryServiceImpl implements ProductCategoryService {

	private ProductCategoryRepository productCategoryRepository;
	
	@Autowired
	public void setProductRepository(
			ProductCategoryRepository productCategoryRepository) {
		this.productCategoryRepository = productCategoryRepository;
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#findAll()
	 */
	@Override
	public List<ProductCategory> findAll() {
		return productCategoryRepository.findAll();
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#find(java.lang.Long)
	 */
	@Override
	public ProductCategory find(int id) {
		return productCategoryRepository.find(id);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#create(com.sample.bank.model.AccountType)
	 */
	@Override
	public void create(ProductCategory item) {
		productCategoryRepository.create(item);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#update(com.sample.bank.model.AccountType)
	 */
	@Override
	public void update(ProductCategory item) {
		productCategoryRepository.update(item);
	}

	/* (non-Javadoc)
	 * @see com.sample.bank.services.AccountTypeService#delete(com.sample.bank.model.AccountType)
	 */
	@Override
	public void delete(ProductCategory item) {
		productCategoryRepository.delete(item);
	}
	
}
