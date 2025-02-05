package com.intern.constructor;

public class constru {
	int x;
	int y;
	constru() {
		 x=20;
		 y=10;
	}
	constru(int a,int b){
		x=a;
		y=b;
	}
	void sum() {
		System.out.println("Sum is"+(x+y));
	}
	public static void main(String args[]) {
		constru con=new constru();
		con.sum();
		constru obj=new constru(50,20);
		obj.sum();
	}
}
