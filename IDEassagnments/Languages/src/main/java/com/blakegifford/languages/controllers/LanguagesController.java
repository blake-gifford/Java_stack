package com.blakegifford.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blakegifford.languages.models.Language;
import com.blakegifford.languages.services.LanguageService;

	
	@Controller
	public class LanguagesController {
		
	    private final LanguageService languageService;
	    
	    public LanguagesController(LanguageService languageService) {
	        this.languageService = languageService;
	    }
	    
	    @RequestMapping("/languages")
	    public String index(Model model) {
	        List<Language> languages = languageService.allLanguages();
	        model.addAttribute("languages", languages);
	        return "/languages/index.jsp";
	    }
	    
	    @RequestMapping("/languages/new")
	    public String newLanguage(@ModelAttribute("language") Language language) {
	        return "/languages/new.jsp";
	    }
	    @RequestMapping(value="/languages", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/languages/new.jsp";
	        } else {
	            languageService.createLanguage(language);
	            return "redirect:/languages";
	        }
	    }
	    
	    @RequestMapping("/language/{id}/edit")
	    public String editLanguage(@PathVariable("id") Long id, Model model) {
	        Language language = languageService.findOneById(id);
	        model.addAttribute("language", language);
	        return "/languages/edit.jsp";
	    }
	    
//	    @RequestMapping(value="/language/{id}", method=RequestMethod.PUT)
//	    public String update(@PathVariable("id") Long id) {
//	    	
//	    }
}
