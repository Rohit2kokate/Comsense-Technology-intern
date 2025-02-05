package com.intern.online;

public class Electronics extends Product{
	double price;
	String prodctName;
	Electronics(String prodctName,long price){
		super(prodctName,price);
		this.price=price;
		this.prodctName=prodctName;
	}
	double p;
	double getDiscountPrice() {
		p=price*0.10;
		price-=p;
		System.out.println("Product name is"+prodctName);
		return price;
	}
}
