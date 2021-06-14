package com.blakegifford.bankaccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankAcctApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankAcctApplication.class, args);
		
		BankAccount account1 = new BankAccount();
//		BankAccount account22 = new BankAccount();
		
		account1.accountNum();
		account1.depositToChecking(20000);
		account1.getCheckingBalance();
		
		
	}

}
