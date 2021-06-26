package com.blakegifford.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blakegifford.productsandcategories.models.Category;
import com.blakegifford.productsandcategories.repos.CategoryRepo;
import com.blakegifford.productsandcategories.repos.ProductRepo;



@Service
public class CategoryService {

	
	private final CategoryRepo categoryRepo;
	private final ProductRepo productRepo;
	
	public CategoryService(CategoryRepo categoryRepo, ProductRepo productRepo) {
		this.categoryRepo = categoryRepo;
		this.productRepo = productRepo;
	}
	
	public List<Category> allCategory(){
		return categoryRepo.findAll();
	}
	
//	public Category createCategoryWithProduct(String categoryName) {
//		List<Product> categoryProduct = new ArrayList<Product>();
//		for(String oneProduct : products.split)
//	}
	
	public Category createCategory(Category c) {
		return categoryRepo.save(c);
	}
	
	public Category findCategory(Long id) {
		Optional<Category> optionalCategory = categoryRepo.findById(id);
		if(optionalCategory.isPresent()) {
			return optionalCategory.get();
		}else {
			return null;
			
		}
	}
	
}
