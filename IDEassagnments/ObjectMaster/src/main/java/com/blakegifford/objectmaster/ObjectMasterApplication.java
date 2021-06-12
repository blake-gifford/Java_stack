package com.blakegifford.objectmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObjectMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjectMasterApplication.class, args);
		
		Human h = new Human("blake");
		Human h1 = new Human("jake");
		
		h.attack(h1);
	}

}
