package com.mayur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mayur.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
