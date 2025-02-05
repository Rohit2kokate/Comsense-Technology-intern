package com.intern.vechicle;

abstract public class Vechicle {
	String brand;
	long speed;
	public Vechicle(String brand,long speed) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		this.speed=speed;
	}
	abstract void accrate();
	void showDetails() {
		System.out.println("Brand is"+brand);
		System.out.println("Speed is"+speed);
	}
}
