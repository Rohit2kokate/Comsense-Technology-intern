package com.intern.bank;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s=new SavingAccount("1001",10000);
		s.deposit(10000);
		s.withdrawl(100);
		s.checkBalance();
		currentAccount c=new currentAccount("101",100000);
		c.deposit(10000);
		c.withdrawl(10);
		c.checkBalance();

	}

}
