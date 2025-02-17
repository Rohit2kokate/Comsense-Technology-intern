package day12.assignment;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        int reversed = 0;
        
        // Reverse the number using a while loop
        while (num != 0) {
            int digit = num % 10; // Get last digit
            reversed = reversed * 10 + digit; // Append digit to reversed number
            num /= 10; // Remove last digit
        }

        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}

