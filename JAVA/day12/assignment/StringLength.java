package day12.assignment;


import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        int length = str.length(); // Get length of the string

        System.out.println("The length of the string is: " + length);

        scanner.close();
    }
}
