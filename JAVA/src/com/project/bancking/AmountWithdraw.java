package com.project.bancking;

public class AmountWithdraw extends AmountDeposite {
	private long withAmount;
	
	void withdrwalAmount() {
		System.out.println("Enter  the amount want to withdrawal");
		withAmount=sc.nextLong();
		if(balance>4999 && withAmount<balance) {
			balance=balance-withAmount;
		}
		else {
			System.out.println("insufficient balance");
		}
	}

}
