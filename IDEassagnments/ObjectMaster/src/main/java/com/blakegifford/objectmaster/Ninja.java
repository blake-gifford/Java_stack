package com.blakegifford.objectmaster;

public class Ninja extends Human{

	//set health to 10
	//add steal(human) method that takes the amount of stealth that the ninja has and removes it from the humans health
	//add runAway() method decreases health by 10
	
	
	public Ninja(String name) {
		super(name);
		this.name = name;
		this.stealth = 10;
		
	}
	
	public void steal(Human human) {
		Integer s = this.getStealth();
		human.setHealth(human.getHealth() - s);
		System.out.println(human.getName() + " lost " + s + " health.");
		System.out.println(human.getHealth());
	}
	
	public void runAway(Ninja ninja) {
		this.setHealth(this.getHealth() - 10);
		System.out.println(this.getName() + " lost 10hp.");
	}
}
