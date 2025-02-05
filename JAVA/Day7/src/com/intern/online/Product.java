package com.intern.online;

abstract public class Product {
	String prodctName;
	long price;
	Product(String prodctName,long price){
		
	}
	abstract double getDiscountPrice();
}
