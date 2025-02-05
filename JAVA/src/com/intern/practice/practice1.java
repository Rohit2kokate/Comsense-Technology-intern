package com.intern.practice;
//import java.util.*;
import java.util.Scanner;
public class practice1 {
	String name;
	int num1;
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		num1=Integer.parseInt(sc.nextLine());
		System.out.print("Enter the name");
		name=sc.nextLine();
		
	}
	void dispaly() {
		System.out.println("Roll No: "+num1+"  NAME: "+name);
	}
	public static void main(String args[]) {
		//System.out.print("Hello");
		practice1 obj=new practice1();
		obj.input();
		obj.dispaly();
	}
}
