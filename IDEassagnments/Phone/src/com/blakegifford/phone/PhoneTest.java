package com.blakegifford.phone;

public class PhoneTest {
	
	public PhoneTest() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Galaxy g = new Galaxy("s9", 99, "Verizon", "Ring Ring");
		Iphone p = new Iphone("x", 100, "AT&T", "Zing Zing");
		
		p.displayInfo();
		System.out.println(p.ring());
		System.out.println(p.unlock());
		System.out.println("-------------------");
		g.displayInfo();
		System.out.println(g.ring());
		System.out.println(g.unlock());
		
	}

}
