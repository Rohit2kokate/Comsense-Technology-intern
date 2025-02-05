package com.project.salaryslip;

import java.util.Scanner;

public class PermanantEmployee extends Company{
	Scanner sc = new Scanner(System.in);
    long empId, contact;
    double basicSalary, grosssalary, HRA, DA, PF, Allow;
    String empName, department, designation, grade;

    void getData() {
        System.out.print("Enter the Employee Id: ");
        empId = sc.nextLong();
        sc.nextLine(); 

        System.out.print("Enter the Name of Employee: ");
        empName = sc.nextLine();

        System.out.print("Enter the Contact Number: ");
        contact = sc.nextLong();
        sc.nextLine(); 

        System.out.print("Enter the Department: ");
        department = sc.nextLine();

        System.out.print("Enter the Basic Salary: ");
        basicSalary = sc.nextLong();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter the Grade: ");
        grade = sc.nextLine();

        System.out.print("Enter the Designation: ");
        designation = sc.nextLine();
    }
    
    double hra() {
        HRA = basicSalary * 0.20;
        return HRA;
    }

    double da() {
        DA = basicSalary * 0.50;
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
        PF = basicSalary * 0.11; 
        return PF;
    }

    double gross() {
        grosssalary = basicSalary + hra() + da() + allow(grade) - pf();
        return grosssalary;
    }
    
    void printSlip() {
    	System.out.println("----------------------------PermanantEmployee Salary Slip----------------------------------");
        System.out.println("\t\t\t" +compName);
        System.out.println(compAddress+"Contact No:"+compContact);
        System.out.println("------------------------------------------------------------------");
        System.out.print("Emp Id: " + empId);
        System.out.println("\t\t\tEmp Name: " + empName);
        System.out.print("Contact: " + contact);
        System.out.println("\t\t" + designation + "," + department);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Grade: " + grade);
        System.out.println("HRA: " + hra());
        System.out.println("DA: " + da());
        System.out.println("Allow: " + allow(grade));
        System.out.println("PF: " + pf());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Gross Salary: " + gross());
        System.out.println("-----------------------------------------------------------------");
    }
}
