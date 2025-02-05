package com.project.salaryslip;

import java.util.Scanner;

public class TemporaryEmployee extends Company{
	    
	    Scanner sc = new Scanner(System.in);
	    long empId, contact,wHourperDay,PresentDay;
	    double grosssalary, HRA, DA, PF, Allow,hourWage=30;
	    String empName, department, designation, grade;

	    void tempGetData() {
	        System.out.print("Enter the TemporaryEmployee Id: ");
	        empId = sc.nextLong();
	        sc.nextLine(); // Consume leftover newline

	        System.out.print("Enter the Name of TemporaryEmployee: ");
	        empName = sc.nextLine();

	        System.out.print("Enter the TemporaryEmployee Contact Number: ");
	        contact = sc.nextLong();
	        sc.nextLine(); // Consume leftover newline

	        System.out.print("Enter the TemporaryEmployee Department: ");
	        department = sc.nextLine();

	        System.out.print("Enter the TemporaryEmployee Grade: ");
	        grade = sc.nextLine();

	        System.out.print("Enter the Designation: ");
	        designation = sc.nextLine();
	        System.out.print("Enter the Working Hour Per Day: ");
	        wHourperDay = sc.nextLong();
	        
	        System.out.print("Enter the TemporaryEmployee Present Day: ");
	        PresentDay = sc.nextLong();
	    }
	    double basicSalary() {
	    	return wHourperDay*PresentDay*hourWage;
	    }
	    double hra() {
	        HRA = basicSalary() * 0.20;
	        return HRA;
	    }

	    double da() {
	        DA = basicSalary() * 0.50;
	        return DA;
	    }

	    double allow(String grade) {
	        if (grade.equalsIgnoreCase("A")) {
	            Allow = 1700;
	        } else if (grade.equalsIgnoreCase("B")) {
	            Allow = 1500;
	        } else {
	            Allow = 1300;
	        }
	        return Allow;
	    }

	    double pf() {
	        PF = basicSalary() * 0.11; 
	        return PF;
	    }

	    double gross() {
	        grosssalary = basicSalary() + hra() + da() + allow(grade) - pf();
	        return grosssalary;
	    }
	    
	    void tempPrintSlip() {
	    	System.out.println("==============================================================================");
	    	System.out.println("|------------------TemporaryEmployee Salary Slip-----------------------------|");
	        System.out.println("|\t\t\t" + compName);
	        System.out.println("|\t\t\t" + compAddress);
	        System.out.println("|-----------------------------------------------------------------------------|");
	        System.out.print("|Emp Id: " + empId);
	        System.out.println("|\t\t\tTemporaryEmployee Name: " + empName+"\t\t\t");
	        System.out.print("|TemporaryEmployee Contact: " + contact);
	        System.out.println("|\t\t" + designation + "," + department+"\t\t\t");
	        System.out.println("|-----------------------------------------------------------------------------|");
	        System.out.println("|Basic Salary: " + basicSalary());
	        System.out.println("|Grade: " + grade);
	        System.out.println("|HRA: " + hra());
	        System.out.println("|DA: " + da());
	        System.out.println("|Allow: " + allow(grade));
	        System.out.println("|PF: " + pf());
	        System.out.println("|---------------------------------------------------------------------------|");
	        System.out.println("|Gross Salary: " + gross());
	        System.out.println("|---------------------------------------------------------------------------|");
	    }
	    public static void main(String[] args) {
	    	TemporaryEmployee obj=new TemporaryEmployee();
	    	System.out.println("===============================================================================");
	    	obj.getName();
	        obj.tempGetData();
	        obj.tempPrintSlip();
	        System.out.println("================================================================================");
	        PermanantEmployee obj1=new PermanantEmployee();
	        obj1.getName();
	        obj1.getData();
	        obj1.printSlip();
	        System.out.println("=================================================================================");

	        
	    }
}
