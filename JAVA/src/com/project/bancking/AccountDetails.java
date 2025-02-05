package com.project.bancking;

import java.util.Scanner;

public class AccountDetails {
	private long accNo;
	private String name;
	protected long balance;
	Scanner sc =new Scanner(System.in);
	
	void addUser() {
		System.out.print("Enter The Account No");
		accNo=sc.nextLong();
		sc.nextLine();
		System.out.print("Enter the User Name");
		name=sc.nextLine();
		System.out.print("Enter the Account Balance");
		balance=sc.nextLong();
	}
	void viewUser() {
		System.out.println("Account No: "+accNo);
		System.out.println("User Name: "+name);
		System.out.println("Account Balance : "+balance);
	}
	void checkBalance() {
		System.out.println("Account Balance:"+balance);
	}
}
