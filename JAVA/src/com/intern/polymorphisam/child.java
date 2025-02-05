package com.intern.polymorphisam;

public class child extends parent{
	void sub(int a,int b) {
		System.out.println("Subtraction:"+(a-b));
	}
	void area(int length,int breath) {
		System.out.println("Area of Rectangle:"+(length*breath));
	}
	public static void main(String args[]) {
		child c=new child();
		c.sub(10, 5);
		c.area(10);
		c.sum(20, 30);
		c.area(5, 5);
	}
}
