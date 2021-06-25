package com.blakegifford.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.blakegifford.productsandcategories.models.Category;
import com.blakegifford.productsandcategories.models.Product;
import com.blakegifford.productsandcategories.services.CategoryService;
import com.blakegifford.productsandcategories.services.ProductService;

@Controller
public class ProductController {
	private final ProductService productService;
	private final CategoryService categoryService;
	public ProductController(ProductService productService, CategoryService categoryService) {
		this.productService = productService;
		this.categoryService = categoryService;
	}
	
//	@Autowired
//	private ProductService productService;
//	
//	@Autowired
//	private CategoryService categoryService;
	
	//show all
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Model model) {
		return "/products/showAll";
				
	}
	
	//show
	@RequestMapping("/products/{id}")
	public String showProduct(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product", productService.findProduct(id));
		model.addAttribute("category", categoryService.findCategory(id));
		return "product/show.jsp";
	}
	
	
	@RequestMapping(value="/products/{id}/edit", method="RequestMethod.POST")
	public String addProductToCategory(@PathVariable("id") Long id, @RequestParam("id") Long id) {
		Product myProduct = productService.findProduct(id);
		Category myCategory = categoryService.findCategory();
		
		myProduct.getCategory.add(myCategory);
		productService.editProduct(myProduct);
		
		return "redirect:/products/" + id + "/edit";
	}
	
	//create
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/products/new.jsp";
		}else {
			productService.createProduct(product);
			return "redirect:/products";
		}
	}
}