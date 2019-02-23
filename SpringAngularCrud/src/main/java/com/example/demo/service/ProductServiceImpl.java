package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired 
	private ProductDao pd;
	
	@Override
	public int addProduct(Product product) {
          Product p= pd.save(product);
           int i=p.getPid();
		  return i;
	}

	@Override
	public List<Product> showAllProduct() {
	      List<Product> product=pd.findAll();
		return product;
	}

	@Override
	public int delProduct(int id) {
		pd.deleteById(id);
		return id;
	}

	@Override
	public Product editProduct(int id) {
		Product product=pd.findById(id).get();
		return product;
	}

	@Override
	public Product updateProduct(Product product) {
		pd.save(product);
		return product;
	}

}
