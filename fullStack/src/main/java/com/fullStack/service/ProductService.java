package com.fullStack.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fullStack.model.Product;


@Service
public class ProductService {

	
	static List<Product> products;
	
	public ProductService() {
		
		this.products = new ArrayList<>();
		Product product1 = new Product();
		product1.setId(1); product1.setProductNameString("Book"); product1.setProductprice(100); product1.setProductCatString("Basic");
		products.add(product1);
		
		Product product2 = new Product();
		product2.setId(2); product2.setProductNameString("Table"); product2.setProductprice(700); product2.setProductCatString("Furniture");
		products.add(product2);
		
		Product product3 = new Product();
		product3.setId(3); product3.setProductNameString("Washing Machine"); product3.setProductprice(9200); product3.setProductCatString("House Hold");
		products.add(product3);
	}
	
	public List getAllProducts() {
		
		return this.products;
	}
	
	
	public void updateProduct(Product product) {
		products.add(0, product);
	}
	
	public void deleteProduct(int index) {
		products.remove(index);
	}
	
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
