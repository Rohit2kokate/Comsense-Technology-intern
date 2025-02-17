package com.intern.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> ll=new LinkedList<>();
		for(int i=0;i<5;i++) {
			int a;
			System.out.println("Enter the number");
			a=sc.nextInt();
			ll.add(a);
		}
		int size=ll.size();
		for(var a=0;a<size;a++) {
			System.out.println("Element is"+ll.get(a));
		}
		
		Collections.sort(ll);
		System.out.println("sorted"+ ll);
		Collections.sort(ll,Collections.reverseOrder());
		System.out.println(ll.isEmpty());
		for(var a:ll) {
			System.out.println("Element is"+a);
		}
		System.out.println(ll.contains(5));
		System.out.println(ll.indexOf(5));
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			System.out.println("it"+it.next());
		}
		System.out.println("Enter the number");
		int a=sc.nextInt();
		ll.addFirst(a);
		ll.addLast(99);
		System.out.println(ll);
	}

}
