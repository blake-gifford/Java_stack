package com.blakegifford.phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "finger print";
    }
    @Override
    public void displayInfo() {
    	System.out.println("The Galaxy has this version number " + this.getVersionNumber() + " from " + this.getCarrier());           
    }
}


