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
import com.blakegifford.dojosandninjas.models.Ninja;
import com.blakegifford.dojosandninjas.services.DojoService;
import com.blakegifford.dojosandninjas.services.NinjaService;



@Controller
public class NinjasController {	
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	public NinjasController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/ninjas")
	public String index(Model model) {
		List<Ninja> ninjas = ninjaService.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "/ninja/new.jsp";
	}
	
	@RequestMapping("/ninja/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
//		model.addAttribute("ninja", new Ninja());
		return "/ninja/new.jsp";
	}
	
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "/ninja/new.jsp";
		}else {
			ninjaService.createNinja(ninja);
			
			return "redirect:/alldojos" + ninja.getDojo().getId();
		}
	}
}
