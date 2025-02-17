package day12.assignment;


import java.time.LocalDate;
import java.util.Scanner;

public class CheckUpcomingDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (YYYY-MM-DD): ");
        String input = scanner.nextLine();
        LocalDate enteredDate = LocalDate.parse(input);

        LocalDate today = LocalDate.now();

        if (enteredDate.isAfter(today)) {
            System.out.println("The entered date is upcoming.");
        } else {
            System.out.println("The entered date is in the past or today.");
        }

        scanner.close();
    }
}
