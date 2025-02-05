package com.project.salaryslip;

import java.util.Scanner;

public class Company {
	String compName;
    String compAddress;
    String compEmail;
    long compContact;
    Scanner sc=new Scanner(System.in);
    void getName() {
    	System.out.println("Enter the name of Company");
    	compName=sc.nextLine();
    	System.out.println("Enter the Address of Company");
    	compAddress=sc.nextLine();
    	System.out.println("Enter the Email of Company");
    	compEmail=sc.nextLine();
    	System.out.println("Enter the Comtact Number of Company");
    	compContact=sc.nextLong();
    	
    } 
}
