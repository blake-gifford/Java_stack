package com.blakegifford.dojosurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/")
	public String form() {
		return "index.jsp";
	}
	
	@PostMapping("/home")
	public String home(HttpSession session, @RequestParam(value="name") String name,
											@RequestParam(value="location") String location,
											@RequestParam(value="lang") String lang,
											@RequestParam(value="description") String description){
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("lang", lang);
		session.setAttribute("description", description);
		return "redirect:/results";
	}
	
	@RequestMapping("/results")
	public String results(HttpSession session, Model model) {
		String name = (String) session.getAttribute("name");
		String location = (String) session.getAttribute("location");
		String lang = (String) session.getAttribute("lang");
		String description = (String) session.getAttribute("description");
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("lang", lang);
		model.addAttribute("description", description);
		return "resutls.jsp";
	}
}
