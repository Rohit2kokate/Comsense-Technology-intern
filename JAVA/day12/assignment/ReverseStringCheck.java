package day12.assignment;
import java.util.Scanner;



public class ReverseStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using StringBuilder
        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("Reversed String: " + reversed);

        // Check if it is a palindrome
        if (input.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
