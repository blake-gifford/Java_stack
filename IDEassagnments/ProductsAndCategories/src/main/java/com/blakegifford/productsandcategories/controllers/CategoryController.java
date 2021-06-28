package com.blakegifford.productsandcategories.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blakegifford.productsandcategories.models.Category;
import com.blakegifford.productsandcategories.services.CategoryService;


@Controller
public class CategoryController {
	private final CategoryService categoryService;
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
//	@Autowired
//	private CategoryService categoryService;
	
	
	
	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category) {
		return "/category/new.jsp";
	}
	
	//show
	@RequestMapping("/category")
	public String showCategory(Model model) {
//		List<Category> category = categoryService.allCategory();
		model.addAttribute("category", new Category());
		return "/category/show.jsp";
	}
	
	@RequestMapping(value="/category", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/category/new.jsp";
		}else {
			categoryService.createCategory(category);
			return "redirect:/products";
		}
	}
}

