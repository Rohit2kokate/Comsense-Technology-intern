package com.intern.practice;

import java.util.Scanner;

public class swapno {
	void swap(int num1,int num2) {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swapping Num1: "+num1+" Num2: "+num2);
	}
	public static void main(String args[]) {
		swapno obj=  new swapno();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num1=sc.nextInt();
		System.out.println("Enter the Number");
		int num2=sc.nextInt();
		System.out.println("Before Swapping Num1: "+num1+" Num2: "+num2);
		
		obj.swap(num1,num2);
	}
}
