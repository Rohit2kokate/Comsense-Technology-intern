package com.intern.bank;

abstract public class BankAccount {
	String accountNumber;
	double balance;
	public BankAccount(String accountNumber,double balance) {
		// TODO Auto-generated constructor stub
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	abstract void deposit(int amount);
	void checkBalance() {
		System.out.println("Balance is"+balance);
	}
}
