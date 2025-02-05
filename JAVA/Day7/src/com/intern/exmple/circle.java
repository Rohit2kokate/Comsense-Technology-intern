package com.intern.exmple;

import java.util.Scanner;

public class circle extends shape{
	Scanner sc =new Scanner(System.in);
	void area() {
		System.out.println("Enter the radius");
		int radius=sc.nextInt();
		final double pi=3.14;
		double area=pi*radius*radius;
		System.out.println("Area of Circle is"+area);
	}
}
