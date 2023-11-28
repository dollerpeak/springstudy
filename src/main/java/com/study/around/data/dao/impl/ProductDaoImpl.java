package com.study.around.data.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.around.data.dao.ProductDao;
import com.study.around.data.entity.ProductEntity;
import com.study.around.data.repository.ProductRepository;

@Service
public class ProductDaoImpl implements ProductDao {

	@Autowired
	ProductRepository productRepository;
	ProductEntity productEntity;

	@Override
	public ProductEntity getProduct(String productid) {
		//productEntity = productRepository.getById(productid);
		productEntity = productRepository.getReferenceById(productid);			
		productRepository.findById(productid);		
		
		return productEntity;
	}

	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) {
		productRepository.save(productEntity);
		
		return productEntity;
	}
}
