package com.blakegifford.objectmaster;

public class Wizard extends Human{
	
	//default health 50 and intelligence 8
	//method called heal that heals whatever it was cast on for an equal amount of the wizards intelligence
	//fireBall method that decreases health by 3* the wiz intelligence
	
	public Wizard(String name) {
		super(name);
		this.name = name;
		this.health  = 50;
		this.intelligence = 8;
	}
	
	public void heal(Wizard wizard) {
		//decreases health by wiz intel...
		Integer h = this.getIntelligence();
		this.setHealth(this.getHealth() + h);
		System.out.println(this.getName() + " healed " + wizard.getName() + " for " + this.getIntelligence() + " health.");
	}
	
	public void fireBall(Wizard wizard) {
		//decreases health by 3 times the inteligence...
		Integer f = this.getIntelligence() * 3;
		this.setHealth(this.getHealth() - f);
		System.out.println(this.getName() + " shot a fireball at " + wizard.getName() + " and caused " + f * 3 + " damage.");
	}

}
