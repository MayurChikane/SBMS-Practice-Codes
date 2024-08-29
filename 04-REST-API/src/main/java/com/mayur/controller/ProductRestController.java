package com.mayur.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.binding.Product;

@RestController
public class ProductRestController {
	
	@GetMapping("/product")
	public ResponseEntity<Product>getproduct(){
		
		Product p=new Product();
		p.setPid(1);
		p.setPname("Mayur");
		p.setPrice(125.6);
		
		return new ResponseEntity<>(p,HttpStatus.OK); 
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>>getProducts(){
		Product p1=new Product(101,"Monitor",8000.5);
		Product p2=new Product(102,"RAM",6000.5);
		Product p3=new Product(103,"CPU",15000.5);
		List<Product>products= Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(products,HttpStatus.OK);
	}
}
