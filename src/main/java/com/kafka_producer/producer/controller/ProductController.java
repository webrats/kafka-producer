package com.kafka_producer.producer.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kafka_producer.producer.Entity.Product;
import com.kafka_producer.producer.service.ProductService;

@RestController
public class ProductController {

	ProductService productService ;
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}


	@PostMapping("/product")
	public ResponseEntity<String> createProduct(@RequestBody Product product) {
		String productId = productService.createProduct(product);
		return  new ResponseEntity<String>(productId,HttpStatus.CREATED);
	}
	
}
