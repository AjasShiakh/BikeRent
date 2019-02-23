package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	@PostMapping("/")
	public int addProduct(@RequestBody Product product)
	{
	 int i=ps.addProduct(product);
	 System.out.println(i);
		return i;
	}
	
	@GetMapping("/")
	public List<Product> showAll()
	{
	    List<Product> products= ps.showAllProduct();
	    return products;
	}
	
	@DeleteMapping("/{id}")
	public int delProduct(@PathVariable int id)
	{
    	 ps.delProduct(id);
		return id;
	}
	
	@GetMapping("/{id}")
	public int editProduct(@PathVariable int id)
	{
	    ps.editProduct(id);
		return id;
	}
	
	@PutMapping("/")
	public Product updateProduct(@RequestBody Product product)
	{
	    ps.updateProduct(product);
		return product;
	}

}
