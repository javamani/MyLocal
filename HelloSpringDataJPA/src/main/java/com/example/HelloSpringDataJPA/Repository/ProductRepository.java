package com.example.HelloSpringDataJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HelloSpringDataJPA.domain.Product;

public interface ProductRepository  extends JpaRepository<Product,Integer> {
	
	Product findByName(String name);

}
