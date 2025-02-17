package com.intern.remainder;
import java.util.Scanner;

//import UserService;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReminderService reminderService = new ReminderService();
        UserService userService = new UserService();

        System.out.println("Welcome to Reminder App");
        System.out.println("1. Register");
        System.out.println("2. Login");

        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            userService.register(scanner);
        }

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        int userId = userService.login(email, password);

        if (userId == -1) {
            System.out.println("Invalid login. Exiting...");
            return;
        }

        while (true) {
            System.out.println("\n1. Add Reminder");
            System.out.println("2. View Reminders");
            System.out.println("3. Delete Reminder");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int action = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (action) {
                case 1:
                    reminderService.addReminder(scanner, userId);
                    break;
                case 2:
                    reminderService.viewReminders(userId);
                    break;
                case 3:
                    reminderService.deleteReminder(scanner, userId);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
