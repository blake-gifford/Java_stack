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
	    
	    @RequestMapping("/Languages")
	    public String index(Model model) {
	        List<Language> Languages = languageService.allLanguages();
	        model.addAttribute("Languages", Languages);
	        return "/Languages/index.jsp";
	    }
	    
	    @RequestMapping("/languages/new")
	    public String newLanguage(@ModelAttribute("Language") Language Language) {
	        return "/Languages/new.jsp";
	    }
	    @RequestMapping(value="/languages", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("language") Language language, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/Languages/new.jsp";
	        } else {
	            languageService.createLanguage(language);
	            return "redirect:/Languages";
	        }
	    }
	    
	    @RequestMapping("/Languages/{id}/edit")
	    public String edit(@PathVariable("id") Long id, Model model) {
//	        Language Language = languageService.updateLanguage(id, name, creator, version);
	        Language language = languageService.findOneById(id);
	        model.addAttribute("Language", language);
	        return "/Languages/edit.jsp";
	    }
}
