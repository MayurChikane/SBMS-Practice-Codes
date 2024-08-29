package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.entity.Product;
import com.mayur.repository.ProductRepo;

@SpringBootApplication
public class SpringJpaTimeStampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringJpaTimeStampApplication.class, args);
		
		ProductRepo p=context.getBean(ProductRepo.class);
		Product product=new Product();
		product.setPid(1);
		product.setPname("Sugar");
		product.setPrice(45.6);
		
		p.save(product);
	}

}
