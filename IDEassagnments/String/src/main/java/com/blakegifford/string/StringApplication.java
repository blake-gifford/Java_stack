package com.blakegifford.string;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@Controller
public class StringApplication {

	public static void main(java.lang.String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}

	
	@RequestMapping("/")
	public String home() {
		return "Hello Client! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring boot is so great and so easy to respond with strings:)";
	}
}
