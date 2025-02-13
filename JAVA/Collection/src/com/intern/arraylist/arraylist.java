package com.intern.arraylist;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arraylist {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		List<Integer> ls=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			int a;
			System.out.println("Enter the number");
			a=sc.nextInt();
			ls.add(a);
		}
		int size=ls.size();
		for(var a=0;a<size;a++) {
			System.out.println("Element is"+ls.get(a));
		}
		
		Collections.sort(ls);
		System.out.println("sorted"+ ls);
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls.isEmpty());
		for(var a:ls) {
			System.out.println("Element is"+a);
		}
		System.out.println(ls.contains(5));
		System.out.println(ls.indexOf(5));

	}
}
