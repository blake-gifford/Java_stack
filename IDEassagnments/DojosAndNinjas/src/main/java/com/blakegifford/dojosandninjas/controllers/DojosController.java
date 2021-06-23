package com.blakegifford.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@RequestMapping("/dojos")
	public String index(Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "/dojo/show.jsp";
	}
	
	@RequestMapping("/dojo")
    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
        return "/dojo/index.jsp";
    }
    @RequestMapping(value="/dojo/new", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
        if (result.hasErrors()) {
            return "/dojo/index.jsp";
        } else {
        	dojoService.createDojo(dojo);
            return "redirect:/dojo";
        }
    }
	
//	@RequestMapping(value="/dojos/edit/{id}")
//	public String editDojo(@PathVariable("id") Long id, Model model) {
//		Dojo dojo = dojoService.findOneById(id);
//		model.addAttribute("dojo", dojo);
//		return "/dojos/edit.jsp";
//	}
	
}
