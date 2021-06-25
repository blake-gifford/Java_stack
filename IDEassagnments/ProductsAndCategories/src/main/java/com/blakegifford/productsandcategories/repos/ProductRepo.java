package com.blakegifford.productsandcategories.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blakegifford.productsandcategories.models.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Long> {
	
	List<Product> findAll();
	Optional<Product> findByName(String name);
	
}
