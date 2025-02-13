package com.intern.cthread;

public class test {
	
	public static void main(String args[]) {
		Thread tone=new Thread(new th1());
		Thread two=new Thread(new th2());
		Thread three=new Thread(new Runnable() {
				
				public void run() {
					for(int i=0;i<5;i++) {
						System.out.println("Thread 3 :"+i);
						try {
							Thread.sleep(1000);
						}
						catch(InterruptedException ie) {
							System.out.println("Execution is interpted");
						}
					}
				}
	});
		
		tone.start();
		
		two.start();
		
		three.start();
		
	}
}
