package day12.assignment;
import java.util.Scanner;




	public class IntegerPalindrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();

	        if (isPalindrome(number)) {
	            System.out.println(number + " is a palindrome.");
	        } else {
	            System.out.println(number + " is NOT a palindrome.");
	        }

	        scanner.close();
	    }

	    public static boolean isPalindrome(int num) {
	        int original = num;
	        int reversed = 0;

	        while (num > 0) {
	            int digit = num % 10;  // Get last digit
	            reversed = reversed * 10 + digit;  // Build reversed number
	            num /= 10;  // Remove last digit
	        }

	        return original == reversed;
	    }
	}

