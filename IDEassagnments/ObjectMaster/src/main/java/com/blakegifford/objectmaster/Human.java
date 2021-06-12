package com.blakegifford.objectmaster;

public class Human {
	//humans have 4 properties
	//strength-3, intelegence-3, stealth-3, health-100
	//each human has ability to attack and takes damage of strength
	private Integer strength = 3;
	private String name;
	private Integer intelligence = 3;
	private Integer stealth = 3;
	private Integer health = 100;
	
	//add attack human method
	
	public Human(String name) {
		this.name = name;
	}
	
	
	public void attack(Human human) {
		Integer h = human.getHealth();
		human.setHealth(h -= this.getStrength());
		System.out.println(this.getName() + " attacked " + human.getName() + "\n" + 
					human.getName() + " has " + human.getHealth() + " health");
		
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getStealth() {
		return stealth;
	}

	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}

	public Integer getHealth() {
		return health;
	}

	public void setHealth(Integer health) {
		this.health = health;
	}
	

}


