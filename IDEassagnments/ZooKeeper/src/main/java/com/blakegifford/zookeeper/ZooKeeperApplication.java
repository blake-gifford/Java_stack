package com.blakegifford.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZooKeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZooKeeperApplication.class, args);
		
		Gorilla george = new Gorilla();
		Bat batthew = new Bat();
		
		//Gorilla
		george.throwSomething();
		george.throwSomething();
		george.throwSomething();
		
		george.eatBananas();
		george.eatBananas();
		george.eatBananas();
		
		george.climb();
		
		//Bat
		batthew.attackTown();
		batthew.attackTown();
		batthew.attackTown();
		
		batthew.eatHumans();
		batthew.eatHumans();
		
		batthew.fly();
		batthew.fly();
		
	}

}
