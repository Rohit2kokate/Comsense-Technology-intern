package com.intern.online;

public class cloating extends Product{
	double price;
	String prodctName;
	cloating(String prodctName,long price){
		super(prodctName,price);
		this.price=price;
		this.prodctName=prodctName;
	}
	double p;
	double getDiscountPrice() {
		p=price*0.20;
		price=price-p;
		System.out.println("Product name is"+prodctName);
		return price;
	}
}
