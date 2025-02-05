package com.intern.perform;
import java.util.Scanner;
import com.tbc.encapsulation.employee;

public class encapsile {
	public static void main(String[] args) {
		
		employee e=new employee();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Id");
		int id=sc.nextInt();
		System.out.print("Enter the Name");
		String name=sc.next();
		
		e.setsId(id);
		System.out.println(e.getsId());
		
		e.setsName(name);
		System.out.println(e.getsName());

	}

}
