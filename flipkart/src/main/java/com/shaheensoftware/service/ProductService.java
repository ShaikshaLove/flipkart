package com.shaheensoftware.service;

import com.shaheensoftware.model.Product;

public class ProductService {
	
	private ProductDao productDao;
	
	 public ProductService() {
		 productDao=new ProductDao();
	 }
	
	public String saveProduct(Product product) {
		 return productDao.save(product);
	 }

}
