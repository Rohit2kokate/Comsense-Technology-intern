package com.intern.employe;

//import java.util.Scanner;

abstract public class employee {
	//Scanner sc =new Scanner(System.in);
	int id;
	String Name;
	double salary;
	employee(int id,String Name,double salary){
		this.id=id;
		this.Name=Name;
		this.salary=salary;
	}
	abstract void calculateBounus();
	
	void Details() {
		System.out.println("Employee Id :"+id);
		System.out.println("Employee Name:"+Name);
		System.out.println("Employee Salary:"+salary);
	}
}
