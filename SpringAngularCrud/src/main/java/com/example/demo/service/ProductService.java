package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public int addProduct(Product product);
	
	public List<Product> showAllProduct();
	
	public int delProduct(int id);
	
	public Product editProduct(int id);
	
	public Product updateProduct(Product product);

}
