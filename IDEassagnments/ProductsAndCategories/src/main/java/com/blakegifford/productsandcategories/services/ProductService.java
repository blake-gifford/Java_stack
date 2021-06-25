package com.blakegifford.productsandcategories.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.blakegifford.productsandcategories.models.Product;
import com.blakegifford.productsandcategories.repos.ProductRepo;

@Service
public class ProductService {

	private final ProductRepo productRepo;
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	
	public Product createProduct(Product p) {
		return productRepo.save(p);
	}
	
	public Product editProduct(Product p) {
		return productRepo.save(p);
	}
	
	public Product findProduct(Long id) {
		Optional<Product> optionalProduct = productRepo.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		}else {
			return null;
		}
	}
	
}
