package com.project.bancking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		
		AmountWithdraw amount=new AmountWithdraw();
		System.out.println("------------------------------------------------------");
		amount.addUser();
		System.out.println("------------------------------------------------------");
		amount.viewUser();
		System.out.println("------------------------------------------------------");
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the choice");
			System.out.println("-----------------------------------------------------");
			System.out.println(" |1.Deposit| \n |2.Withdraw| \n |3.Check Balance| \n |4.Exit|");
			System.out.println("-----------------------------------------------------");
			choice=sc.nextInt();
		
			switch(choice) {
				case 1:
					amount.deposit();
					break;
				case 2:
					amount.withdrwalAmount();
					break;
				case 3:
					amount.checkBalance();
					break;
				case 4:
					break;
				default:
					System.out.println("wroung Choice");
			}
		}while(choice!=4);
		
	}

}
