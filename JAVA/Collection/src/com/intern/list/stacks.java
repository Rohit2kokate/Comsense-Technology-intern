package com.intern.list;

import java.util.Scanner;
import java.util.Stack;

public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			int a;
			System.out.println("Enter the number");
			a=sc.nextInt();
			st.push(a);
		}
		System.out.println(st.empty());
		System.out.println(st.search(10));
		int size=st.size();
		for(int i=0;i<size;i++) {
			System.out.println(st.peek());
			st.pop();
		}
		
		System.out.println(st.isEmpty());
	}

}
