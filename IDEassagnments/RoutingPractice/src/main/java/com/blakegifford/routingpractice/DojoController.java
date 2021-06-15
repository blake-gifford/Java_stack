package com.blakegifford.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{text}")
	public String code(@PathVariable("text") String text) {
		
		if(text == "dojo") {
			return "The dojo is awesome!";
		}
		else if(text == "burbank-dojo") {
			return "Burbank Dojo is located in Southern California";
		}
		else {
			return "SJ dojo is the headquarters";
		}
		
		
		
	}
	
}
