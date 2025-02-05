package com.intern.vechicle;

public class Car extends Vechicle {
	public Car(String brand,long speed) {
		super(brand,speed);
	}
	void accrate() {
		int count =0;
		while(count<100) {
			
			System.out.println("Accerate in Car"+count);
			count=count+15;
		}
		
	}
}
