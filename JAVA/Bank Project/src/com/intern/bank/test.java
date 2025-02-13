package com.intern.bank;

import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
				Scanner sc =new Scanner(System.in);
				insert ir=new insert();
				deposit dp=new deposit();
				withdrawl wit=new withdrawl();
				display ds=new display();
				transfer tr=new transfer();
				loan lo=new loan();
				int in;
				do {
						System.out.println(" 1.INSERT \n 2.Deposit \n 3.WithDraw \n 4.Display \n 5.Transfer \n 6.Loan");
						System.out.print("ENTER THE CHOICE");
						int ch=sc.nextInt();
						switch(ch) {
							case 1:
								ir.inserts();
								break;
							case 2:
								dp.deposits();
								break;
							case 3:
								wit.withdrawls();
								break;
							case 4:
								ds.displays();
								break;
							case 5:
								tr.transfer();
								break;
							case 6:
								lo.loan();
								break;
							default:
								System.out.println("Wrong Choice");
								break;
						}
						System.out.println("DO you Want to couniue");
						in=sc.nextInt();
				}while(in!=0);
		}
}

