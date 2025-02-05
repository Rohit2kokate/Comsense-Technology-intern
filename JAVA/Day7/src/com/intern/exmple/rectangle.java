package com.intern.exmple;

import java.util.Scanner;

public class rectangle extends shape{
	
	Scanner sc =new Scanner(System.in);
	void area() {
		System.out.println("Enter the length");
		int len=sc.nextInt();
		System.out.println("Enter the breath");
		int bre=sc.nextInt();
		//final double pi=3.14;
		double area=len*bre;
		System.out.println("Area of Circle is"+area);
	}
}
