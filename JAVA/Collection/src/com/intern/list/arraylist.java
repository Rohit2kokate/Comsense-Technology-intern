package com.intern.list;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class arraylist {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		List<Integer> ls=new ArrayList<>();
		
		for(int i=0;i<5;i++) {
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
		Iterator it=ls.iterator();
		while(it.hasNext()) {
			System.out.println("it"+it.next());
		}
		
		ls.add(3, 25);
		System.out.println(ls);
		System.out.println(ls.size());
		ls.remove(2);
		System.out.println(ls.size());
		((ArrayList<Integer>) ls).trimToSize();
		System.out.println(ls.size());
		
		//System.out.println("size"+);
	}
}
