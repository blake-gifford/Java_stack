package com.blakegifford.dojosandninjas.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@RequestMapping("/ninja")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja) {
		return "/ninja/";
	}
}
