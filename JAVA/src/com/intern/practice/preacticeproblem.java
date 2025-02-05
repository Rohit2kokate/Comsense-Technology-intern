package com.intern.practice;
import java.util.*;
import java.util.Scanner;
public class preacticeproblem {
	Scanner sc = new Scanner(System.in);
	void vowelConsenent() {
		String str;
		System.out.println("Enter The character");
		str=sc.next();
		char ch=str.charAt(0);
		if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U' || ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u') {
				System.out.println("This is Vowel");
		}
		else {
			System.out.println("This is Consonent");
		}
			
	}
	void leapYear() {
		System.out.println("Enter the Year");
		int year=sc.nextInt();
		if(year%4==0 || year%400==0) {
			System.out.println("leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
		
	}
	void diamond() {
		System.out.print("Enter the number odd number");
		int rows=sc.nextInt();
		 int spaces = rows / 2;
	        int stars = 1;

	        // Upper part of the diamond
	        for (int i = 1; i <= rows / 2 + 1; i++) {
	            // Print spaces
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= stars; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            spaces--;
	            stars += 2;
	        }
	        
	        spaces = 1;
	        stars = rows - 2;
	        for (int i = 1; i <= rows / 2; i++) {
	            // Print spaces
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int j = 1; j <= stars; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	            spaces++;
	            stars -= 2;
	        }

	}
	void countDigit() {
		System.out.print("Enter the number want to count the digit");
		int number=sc.nextInt();
		int count=0;
		while(number!=0) {
			count+=1;
			number=number/10;
		}
		System.out.println("Digit in number is "+count);
	}
	void fib() {
		int num1=0,num2=1;
		
		System.out.println("How Many Number Want to Print");
		int number=sc.nextInt();
		number-=2;
		System.out.print(num1+" "+ num2);
		while(number>0) {
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			System.out.print(" "+num3+" ");
			number--;
		}
	}
	void perfectnumber() {
		System.out.println("Enter the number wan to check perfect number or not");
		int m=sc.nextInt();
		int sum=0;
		for(int i=1;i<=m/2;i++) {
			
			if(m%i==0) {
				sum+=i;
			}
			//System.out.println(sum+" "+m);
		}
		
		if(m==sum) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not Perfect Number");
		}
	}
	
	private static int getNext(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }
        return sum;
    }
	
	 public static boolean isHappyNumber(int n) {
	        Set<Integer> seen = new HashSet<>();
	        while (n != 1 && !seen.contains(n)) {
	            seen.add(n);
	            n = getNext(n);
	        }
	        return n == 1;
	    }
	void happy() {
		 System.out.print("Enter a number want to check happy or unhappy: ");
		 int number = sc.nextInt();
		        
		 if (isHappyNumber(number)) {
		       System.out.println(number + " is a happy number!");
		 } else {
		       System.out.println(number + " is an unhappy number.");
		 }
		    
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		preacticeproblem pp=new preacticeproblem();
		int ch;
		do {
			System.out.print("Enter the Choice\n1.Vowel \n2.Leap Year \n3.Fibnocies Series \n4 Pattern \n5 Perfect Number \n6 Happy UnHappy \n7 count Digit \n8 Exit\n:-");
				int choice=sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("=============================================================================");
						pp.vowelConsenent();
						break;
					case 2:
						System.out.println("=============================================================================");
						pp.leapYear();
						break;
					case 3:
						System.out.println("=============================================================================");
						pp.fib();
						break;	
					case 4:
						System.out.println("=============================================================================");
						pp.diamond();
						break;
					case 5:
						System.out.println("=============================================================================");
						pp.perfectnumber();
						break;
					case 6:
						System.out.println("=============================================================================");
						pp.happy();
						break;
					case 7:
						System.out.println("\n=============================================================================");
						pp.countDigit();
						break;
					case 8:
						break;
					default:
						System.out.println("Wrong Input");
						break;
				}
				System.out.println("Do you Want to continue[0/1]");
				ch=sc.nextInt();
						
		}while(ch!=0);
	}
}
