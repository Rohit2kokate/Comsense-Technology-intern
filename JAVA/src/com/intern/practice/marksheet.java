package com.intern.practice;

import java.util.Scanner;

class marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("          STUDENT MARKSHEET         ");
        System.out.println("====================================");
        
        // Get student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNo = sc.nextLine();
        
        // Get number of subjects
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        
        int marks[] = new int[numSubjects];
        int total = 0;
        
        // Input marks for each subject
        System.out.println("====================================");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        
        // Calculate percentage
        float percentage = (float) total / numSubjects;
        
        // Determine grade
        String grade;
        if (percentage >= 90) {
            grade = "A (Excellent)";
        } else if (percentage >= 75) {
            grade = "B (Very Good)";
        } else if (percentage >= 60) {
            grade = "C (Good)";
        } else if (percentage >= 50) {
            grade = "D (Pass)";
        } else {
            grade = "F (Fail)";
        }
        
        // Display result
        System.out.println("====================================");
        System.out.println("           MARKSHEET RESULT         ");
        System.out.println("====================================");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);
        System.out.println("Total Marks  : " + total);
        System.out.println("Percentage   : " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade        : " + grade);
        System.out.println("====================================");
    }
}

