package com.intern.employe;

public class fullTimeEmployee extends employee{
	double salary;
	fullTimeEmployee(int id, String Name, double salary) {
		super(id, Name, salary);
		this.salary=salary;
	}
	double bonus;
	void calculateBounus() {
		bonus=salary*0.20;
		System.out.println("Bonus is"+bonus);
	}
}
