package com.intern.online;

public class test {
	public static void main(String args[]) {
		Electronics ele=new Electronics("Iphone 13", 10000);
		double d=ele.getDiscountPrice();
		System.out.println("Discount Price:"+d);
		cloating clo=new cloating("Cottan Candy", 1000);
		System.out.println("Discount Price:"+clo.getDiscountPrice());
	}
	
}
