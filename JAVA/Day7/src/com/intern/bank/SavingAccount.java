package com.intern.bank;

public class SavingAccount extends BankAccount{
	public SavingAccount(String accountNumber,double balance) {
		// TODO Auto-generated constructor stub
		super(accountNumber,balance);
	}
	void deposit(int amount) {
		if(amount>0) {
			balance+=amount;
		}
		else {
			System.out.println("Invalid Amount Enter");
		}
	}
	void withdrawl(int amount) {
		double temp=balance;
		temp=temp-amount;
		if(amount<balance && temp>1000 && amount>0) {
			balance-=amount;
		}
		else {
			System.out.println("Wrong Input");
		}
	}
}
