package com.intern.threadclass;

public class test {
	public static void main(String args[]) {
		thread1 th1=new thread1();
		thread2 th2=new thread2();
		th1.start();
		th2.start();
		
	}
	
}
