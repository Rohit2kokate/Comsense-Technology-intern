package com.intern.practice;

import java.util.Scanner;

public class pract2 {
	Scanner sc=new Scanner(System.in);
	void square() {
		System.out.println("Enter the side");
		int side=sc.nextInt();
		System.out.println("Area of Square"+(side*side));
	}
	void rec() {
		System.out.println("Enter the Length and Breath");
		int len=sc.nextInt();
		int bre=sc.nextInt();
		System.out.println("Area of restangle"+(len*bre));
	}
	void circle() {
		final double pi=3.14;
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		System.out.println("Area of Circle is"+(pi*(radius*radius)));
		
	}
	public static void main(String args[]) {
		pract2 p=new pract2();
		Scanner sc=new Scanner(System.in);
		int num;
		do {
				System.out.println("Enter the Choice");
				System.out.println(" 1.Rectangle\n 2.Circle\n 3.Square\n 4.Exit");
				int num1=sc.nextInt();
				switch(num1) {
					case 1:
						p.rec();
						break;
					case 2:
						p.circle();
						break;
					case 3:
						p.square();
						break;
					case 4:
						break;
			}
			System.out.println("Do you want to countiue[1/0]");
			num=sc.nextInt();
		}while(num!=0);
	}
}
