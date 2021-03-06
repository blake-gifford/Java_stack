package com.blakegifford.productsandcategories.controllers;

import java.util.List;

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
	
	@RequestMapping("/")
	public String redirect() {
		return "redirect:/products/new";
	}
	
	
	//show all
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product) {
//		return "/products/showAll";
		return "/products/new.jsp";
				
	}
	
	//show
	@RequestMapping("/products")
//	@RequestMapping("/products")
//	public String showProduct(@PathVariable("prod_id") Long prod_id, Model model) {
	public String showProduct(Model model) {
		List<Product> product = productService.allProducts();
		model.addAttribute("product", product);
//		model.addAttribute("product", productService.findProduct(prod_id));
//		model.addAttribute("category", categoryService.allCategory());
		return "products/show.jsp";
	}
	
	
	@RequestMapping(value="/products/{prod_id}/edit", method=RequestMethod.POST)
	public String addProductToCategory(@PathVariable("prod_id") Long prod_id, @RequestParam("cat_id") Long cat_id) {
		Product myProduct = productService.findProduct(prod_id);
		Category myCategory = categoryService.findCategory(cat_id);
		
		myProduct.getCategory().add(myCategory);
		productService.editProduct(myProduct);
		
		return "redirect:/products/" + prod_id + "/edit";
	}
	
	//create
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("product") Product product, BindingResult result, @PathVariable("prod_id") Long prod_id) {
		if(result.hasErrors()) {
			return "/products/new.jsp";
		}else {
			productService.createProduct(product);
			return "redirect:/products/" + prod_id;
		}
	}
}
