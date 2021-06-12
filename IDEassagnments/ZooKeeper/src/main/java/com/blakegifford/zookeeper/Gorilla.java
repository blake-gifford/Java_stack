package com.blakegifford.zookeeper;


public class Gorilla extends Mammal {
		//throw something method
		//eat banana method
		// climb method
	public Gorilla() {
		System.out.println("Gorilla Starting Energy: " + energyLevel);
	
	}
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Gorilla has thrown a thing");
		System.out.println("Gorilla Energy Level: " + energyLevel);
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("Run the Gorilla is eating a banana and will gain more health!!!!!!");
		System.out.println("Gorilla Energy Level: " + energyLevel);
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("Look the Gorilla is climbing something AHHHHHHHH!!!!!");
		System.out.println("Gorilla Energy Level: " + energyLevel);
	}
		

}
