package com.intern.remainder;
import java.sql.*;
import java.util.*;
public class ReminderService {
    private static final String INSERT_REMINDER_SQL = "INSERT INTO reminders (title, description, date, user_id) VALUES (?, ?, ?, ?)";
    private static final String SELECT_REMINDERS_SQL = "SELECT id, title, date FROM reminders WHERE user_id = ?";
    private static final String DELETE_REMINDER_SQL = "DELETE FROM reminders WHERE id = ? AND user_id = ?";

    public void addReminder(Scanner scanner, int userId) {
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Description: ");
        String description = scanner.nextLine();
        System.out.print("Enter Date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        try (Connection connection = Dbconnection.connect();
             PreparedStatement statement = connection.prepareStatement(INSERT_REMINDER_SQL)) {

            statement.setString(1, title);
            statement.setString(2, description);
            statement.setString(3, date);
            statement.setInt(4, userId);
            statement.executeUpdate();

            System.out.println("Reminder added successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewReminders(int userId) {
        try (Connection connection = Dbconnection.connect();
             PreparedStatement statement = connection.prepareStatement(SELECT_REMINDERS_SQL)) {

            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();

            System.out.println("\nYour Reminders:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ". " + resultSet.getString("title") + " - " + resultSet.getDate("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteReminder(Scanner scanner, int userId) {
        System.out.println("\nYour reminders:");
        viewReminders(userId);

        System.out.print("Enter Reminder ID to delete: ");
        int reminderId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        try (Connection connection = Dbconnection.connect();
             PreparedStatement statement = connection.prepareStatement(DELETE_REMINDER_SQL)) {

            statement.setInt(1, reminderId);
            statement.setInt(2, userId);

            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Reminder deleted successfully!");
            } else {
                System.out.println("Reminder not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
