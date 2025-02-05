package com.intern.employe;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------------------------------");
		employee e=new fullTimeEmployee(10, "Rohit Kokate", 1000);
		e.Details();
		e.calculateBounus();
		System.out.println("------------------------------------------");
		e=new partTimeEmployee(11, "Shantanu Dhokale", 100);
		e.Details();
		e.calculateBounus();
		System.out.println("------------------------------------------");

	}

}
