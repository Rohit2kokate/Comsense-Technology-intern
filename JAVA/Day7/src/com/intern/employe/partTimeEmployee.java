package com.intern.employe;

public class partTimeEmployee extends employee{
	double salary;
	public partTimeEmployee(int id, String Name, double salary) {
		super(id, Name, salary);
		this.salary=salary;
	}
	double bonus;
	void calculateBounus() {
		bonus=salary*0.10;
		System.out.println("Bonus is"+bonus);
	}
}
