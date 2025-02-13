package com.intern.threadclass;

public class joinexample {
	public static void main(String args[]) {
		Thread th1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++) {
					System.out.println("THREAD 1: "+i);
				}
			}
		});
		Thread th2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0;i<10;i++) {
					System.out.println("THREAD 2: "+i);
				}
			}
		});
		th1.start();
		th2.start();
		System.out.println("Done Execution");
	}
}
