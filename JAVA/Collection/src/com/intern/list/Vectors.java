package com.intern.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Vectors {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Vector<Integer> ll=new Vector<Integer>();
		for(int i=0;i<5;i++) {
			int a;
			System.out.println("Enter the number");
			a=sc.nextInt();
			ll.add(a);
		}
	}
}
