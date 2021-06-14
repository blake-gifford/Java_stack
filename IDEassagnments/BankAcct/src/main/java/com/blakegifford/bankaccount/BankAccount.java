package com.blakegifford.bankaccount;

import java.util.Random;

public class BankAccount {
	
	//class should have string(acct num), double(checkingBalance), double(savings)-done
	//create a class member static that has a number of acct created-done
	//create a class member static that tracks total amount of money stored in every acct created-
	//create a private method that retyrns a random tex dig acct num
	//in constructor call pricate method from above so that each user has a random digit acct num
	//in constructor increment acct count
	//create getters and setters for user cheking balance and savings
	//create method that allows ppl to deposite money into either the checking or saving add total amount stored
	//create method to withdrawl money from an acct
	//dont allow withdrawl if there is no money in acct
	//create method to see the total money from the checking and savings acct
	//users should  not be able to set any of the attributes from the class
	
	protected String accountNum;
	private Double checkingBalance;
	private Double savingBalance;
	private static int numOfAcct = 0;
	private static Double accountTotals = 0.0;
	
	protected String accountNum() {
		int[] numArr = new int[10];
		String accountNum = "";
		int tempVar;
		for (int i = 0; i < numArr.length; i++) {
			Random r = new Random();
			tempVar = r.nextInt(10);
			accountNum += tempVar;
			
		}
		return accountNum;
	}
	
	public BankAccount() {
		this.setAccountNum(this.accountNum());
		this.setCheckingBalance(0.0);
		this.setSavingBalance(0.0);
		numOfAcct++;
	}
	
	public void depositToChecking(double deposit) {
		this.checkingBalance += deposit;
		accountTotals += deposit;
	}
	
	public void depositToSaving(double deposit) {
		this.savingBalance += deposit;
		accountTotals += deposit;
	}
	
	public void withdrawlChecking(double withdrawl) {
		if(withdrawl < this.checkingBalance) {
			this.checkingBalance -= withdrawl;
			accountTotals -= withdrawl;
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void withdrawlSaving(double withdrawl) {
		if(withdrawl < this.savingBalance) {
			this.savingBalance -= withdrawl;
			accountTotals -= withdrawl;
		}else {
			System.out.println("Insufficient Funds");
		}
	}
	
	public void allMoney() {
		System.out.println("Checking account has: " + this.getCheckingBalance() + " and your Savings account has " + this.getSavingBalance());
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public void setCheckingBalance(Double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}

	public Double getSavingBalance() {
		return savingBalance;
	}

	public void setSavingBalance(Double savingBalance) {
		this.savingBalance = savingBalance;
	}

	public static int getNumOfAcct() {
		return numOfAcct;
	}

	public static void setNumOfAcct(int numOfAcct) {
		BankAccount.numOfAcct = numOfAcct;
	}

	public static Double getAccountTotals() {
		return accountTotals;
	}

	public static void setAccountTotals(Double accountTotals) {
		BankAccount.accountTotals = accountTotals;
	}
	
}
