package com.blakegifford.objectmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObjectMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjectMasterApplication.class, args);
		
		Human h = new Human("blake");
		Human h1 = new Human("jake");
		Samurai s = new Samurai("nick");
		Samurai s1 = new Samurai("mike");
		Wizard w = new Wizard("Josh");
		Wizard w1 = new Wizard("George");
		Ninja n = new Ninja("nin the ninja");
		Ninja n1 = new Ninja("black belt ninja");
		
		
		h.attack(h1);
		s.deathBlow(s1);
		s1.meditate(s1);
		w1.heal(w);
		w1.fireBall(w);
		n.steal(h1);
		
	}

}
