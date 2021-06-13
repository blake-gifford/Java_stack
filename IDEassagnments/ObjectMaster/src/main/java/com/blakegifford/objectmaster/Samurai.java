package com.blakegifford.objectmaster;

public class Samurai extends Human{
	protected static int numOfSamurai = 0;
	
	public Samurai(String name){
		super(name);
		this.name = name;
		this.health = 200;
		numOfSamurai++;
	
				
		//create deathBlow method decrease health to 0 but halves samurais health
		//create meditate method heals samurai to full health
		//create howMany method returns current num of samurais
		
	}
	
	public void deathBlow(Samurai samurai) {
		Integer h = samurai.getHealth();
		samurai.setHealth(h = 0);
		this.setHealth(this.getHealth()/2);
		System.out.println(this.getName() + " killed " + samurai.getName());
		System.out.println(samurai.getName() + " has " + samurai.getHealth() + " health");
	}
	
	public void meditate(Samurai samurai) {
		Integer s = samurai.getHealth();
		samurai.setHealth(s = 200);
		System.out.println(this.getName() + " is meditating and his health is now at " + this.getHealth());
		
	}
	
	public void numOfSam(Samurai samurai) {
		System.out.println(numOfSamurai);
	}
}
