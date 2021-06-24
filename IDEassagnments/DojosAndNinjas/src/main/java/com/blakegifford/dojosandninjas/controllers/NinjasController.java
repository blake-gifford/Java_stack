package com.blakegifford.dojosandninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blakegifford.dojosandninjas.models.Ninja;
import com.blakegifford.dojosandninjas.services.NinjaService;


@Controller
public class NinjasController {	
	private final NinjaService ninjaService;
	public NinjasController(NinjaService ninjaService) {
		this.ninjaService = ninjaService;
	}
	
	@RequestMapping("/ninjas")
	public String index(Model model) {
		List<Ninja> ninjas = ninjaService.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "/ninja/new.jsp";
	}
	
	@RequestMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		return "/ninja/new.jsp";
	}
	
	@RequestMapping(value="/ninja", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninja/new.jsp";
		}else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas";
		}
	}
}
