package com.blakegifford.dojosandninjas.controllers;

import java.util.List;

//import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blakegifford.dojosandninjas.models.Dojo;
import com.blakegifford.dojosandninjas.services.DojoService;


@Controller
public class DojosController {
	private final DojoService dojoService;
	public DojosController(DojoService dojoService) {
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/alldojos")
	public String allDojos(Model model) {
		List<Dojo> dojo = dojoService.allDojos();
		model.addAttribute("dojo", dojo);
		return "/dojo/allDojos.jsp";
	}
	
	@RequestMapping("/dojo/{id}")
	public String index(Model model, @PathVariable("id") Long id) {
		model.addAttribute("dojo", dojoService.findDojo(id));
		return "/dojo/show.jsp";
	}
	
	@RequestMapping("/dojo")
    public String newDojo(Model model, @ModelAttribute("dojo") Dojo dojo) {
		model.addAttribute("dojo", dojoService.allDojos());
        return "/dojo/index.jsp";
    }
    @RequestMapping(value="/dojo/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojo/index.jsp";
        } else {
        	Dojo newDojo = dojoService.createDojo(dojo);
            return "redirect:/dojo/" + newDojo.getId();
        }
    }
	
//	@RequestMapping(value="/dojos/edit/{id}")
//	public String editDojo(@PathVariable("id") Long id, Model model) {
//		Dojo dojo = dojoService.findOneById(id);
//		model.addAttribute("dojo", dojo);
//		return "/dojos/edit.jsp";
//	}
	
}
