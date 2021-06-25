package com.blakegifford.productsandcategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blakegifford.productsandcategories.models.Category;
import com.blakegifford.productsandcategories.services.CategoryService;

@Controller
public class CategoryController {

	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping("/category/new")
	public String newCategory() {
		return "/category/new.jsp";
	}
	
	//show
	@RequestMapping("/category")
	public String showCategory(Model model) {
//		List<Category> category = categoryService.allCategory();
		model.addAttribute("category", new Category());
		return "/category/show.jsp";
	}
	
	
}

