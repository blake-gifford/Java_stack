//package com.blakegifford.dojosandninjas.controllers;
//
//import java.util.List;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.blakegifford.dojosandninjas.models.Dojo;
//
//
//@Controller
//public class DojoApi {
//
//
//	@RequestMapping("/api/dojos")
//	public List<Dojo> index(){
//		Object dojoService;
//		return dojoService.allDojos();
//	}
//	
//	@RequestMapping(value="/api/dojos", method=RequestMethod.POST)
//	public Dojo create(@RequestParam(value="name") String name) {
//		Dojo dojo = new Dojo();
//		return dojoService.createDojo(dojo);
//	}
//	
//	@RequestMapping("/api/dojo/{id}")
//	public Dojo show(@PathVariable("id") Long id) {
//		Dojo dojo = dojoService.findDojo(id);
//		return dojo;
//	}
//}
