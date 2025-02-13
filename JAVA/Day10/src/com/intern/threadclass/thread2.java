package com.intern.threadclass;

public class thread2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("THREAD 1 :"+i);
		}
	}
}
