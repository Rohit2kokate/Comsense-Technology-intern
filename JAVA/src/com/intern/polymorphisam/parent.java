package com.intern.polymorphisam;

public class parent {
	void sum(int a,int b) {
		System.out.println("Sum:"+(a+b));
	}
	void area(double radius) {
		final double pi=3.14;
		double circle=pi*radius*radius;
		System.out.println("Area of Circle is:"+circle);
	}
}
