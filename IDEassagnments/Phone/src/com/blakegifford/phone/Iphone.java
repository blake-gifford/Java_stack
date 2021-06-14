package com.blakegifford.phone;

public class Iphone extends Phone implements Ringable {
    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
        
    	return "face ID";
    }
    @Override
    public void displayInfo() {
    	
    	System.out.println("The Iphone has this version number " + this.getVersionNumber() + " from " + this.getCarrier());
    }
}

