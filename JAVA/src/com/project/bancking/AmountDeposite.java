package com.project.bancking;

import java.util.Scanner;

public class AmountDeposite extends AccountDetails{
	protected long depAmount;
	Scanner sc =new Scanner(System.in);
	long deposit() {
		System.out.print("Enter The Amount Want To Deposite");
		depAmount=sc.nextLong();
		if(depAmount>0) {
			
			balance=balance+depAmount;
			
		}
		else {
			System.out.println("Wrong Input");
		}
		return depAmount;
	}
}
