package com.intern.exmple;

import java.util.Scanner;

public class square extends shape{
	
	Scanner sc =new Scanner(System.in);
	void area() {
		System.out.println("Enter the side of square");
		int side=sc.nextInt();
		//final double pi=3.14;
		double area=side*side;
		System.out.println("Area of Square is"+area);
	}
}
