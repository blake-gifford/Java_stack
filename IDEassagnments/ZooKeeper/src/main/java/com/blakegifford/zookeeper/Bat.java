package com.blakegifford.zookeeper;

public class Bat extends Mammal {
	//set energy to 300
	//fly method energy-50
	// eat humans method+25
	//attack town method-100
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("The Bat is flying run!!!");
		System.out.println("Bat Energy Level: " + energyLevel);
	}
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("that gross the bat is eating a human!");
		System.out.println("Bat Energy Level: " + energyLevel);
	}
	
	public void attackTown() {
		energyLevel += 100;
		System.out.println("Look the Bat is attacking the whole town!!");
		System.out.println("Bat Energy Level: " + energyLevel);
	}
}
