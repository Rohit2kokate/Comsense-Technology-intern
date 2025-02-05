package com.intern.abstraction;
 
abstract public class child extends Parent {
	
	static{
		que=20;
	}
	{
		//que=10;
		System.out.println("iniatizal block");
		System.out.println(que+que);
	}
	void job() {
		System.out.println("Job");
		//que=5;
	}
	
	
}
