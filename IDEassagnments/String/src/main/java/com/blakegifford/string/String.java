package com.blakegifford.string;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

	}
	
	@RequestMapping("/")
	public java.lang.String home() {
		return "Test Test";
	}
	
	@RequestMapping("/random")
	public java.lang.String random() {
		return "Spring boot is so great and so easy to respond with strings:)";
	}

}
