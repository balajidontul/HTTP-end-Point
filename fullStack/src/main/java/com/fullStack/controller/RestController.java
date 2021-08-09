package com.fullStack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fullStack.model.Product;
import com.fullStack.service.ProductService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/api")
public class RestController {

	@Autowired
	ProductService productService;
	
	@GetMapping("/product")
	public List getResp() {
		
		return productService.getAllProducts();
	}
	
	@PostMapping("/product")
	public List getProducts(@RequestBody Product product) {
	
		productService.addProduct(product);
		return productService.getAllProducts();
	}
	
	
	@PutMapping("/product")
	public String postProducts(@RequestBody Product product) {
		productService.updateProduct(product);
		
		return "Done";
	}
	
	@DeleteMapping("/product")
	public List name(@RequestBody int index) {
		
		productService.deleteProduct(index);
		return productService.getAllProducts();
	}
}
