package com.blakegifford.zookeeper;

public class Mammal {
	
	public int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public int displayEnergy() {
		System.out.println("Mammals energy level is " + energyLevel);
		return energyLevel;
	}


}
