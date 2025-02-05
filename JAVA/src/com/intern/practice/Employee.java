package com.intern.practice;

import java.util.Scanner;

public class Employee {
    final String compName = "The Baap Company";
    final String compAddress = "Paregaon, Ahilaynager, MH, IND";
    Scanner sc = new Scanner(System.in);
    long empId, contact;
    double basicSalary, grosssalary, HRA, DA, PF, Allow;
    String empName, department, designation, grade;

    void input() {
        System.out.print("Enter the Employee Id: ");
        empId = sc.nextLong();
        sc.nextLine(); // Consume leftover newline

        System.out.print("Enter the Name of Employee: ");
        empName = sc.nextLine();

        System.out.print("Enter the Contact Number: ");
        contact = sc.nextLong();
        sc.nextLine(); // Consume leftover newline

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

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.input();

        System.out.println("--------------------------------------------------------------");
        System.out.println("\t\t\t" + obj.compName);
        System.out.println("\t\t\t" + obj.compAddress);
        System.out.println("------------------------------------------------------------------");
        System.out.print("Emp Id: " + obj.empId);
        System.out.println("\t\t\tEmp Name: " + obj.empName);
        System.out.print("Contact: " + obj.contact);
        System.out.println("\t\t" + obj.designation + "," + obj.department);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Basic Salary: " + obj.basicSalary);
        System.out.println("Grade: " + obj.grade);
        System.out.println("HRA: " + obj.hra());
        System.out.println("DA: " + obj.da());
        System.out.println("Allow: " + obj.allow(obj.grade));
        System.out.println("PF: " + obj.pf());
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Gross Salary: " + obj.gross());
        System.out.println("-----------------------------------------------------------------");
    }
}
