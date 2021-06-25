package com.blakegifford.productsandcategories.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blakegifford.productsandcategories.models.Category;

@Repository
public interface CategoryRepo extends CrudRepository<Category, Long> {
	
	List<Category> findAll();
	
}
