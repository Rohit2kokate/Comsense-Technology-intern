package com.intern.remainder;
import java.sql.*;
import java.util.Scanner;

//import DatabaseConnection;

public class UserService {
    private static final String REGISTER_SQL = "INSERT INTO users (email, password) VALUES (?, ?)";
    private static final String LOGIN_SQL = "SELECT id FROM users WHERE email = ? AND password = ?";

    public void register(Scanner scanner) {
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        try (Connection connection = Dbconnection.connect();
             PreparedStatement statement = connection.prepareStatement(REGISTER_SQL)) {
            
            statement.setString(1, email);
            statement.setString(2, password);
            statement.executeUpdate();
            
            System.out.println("Registration successful!");
        } catch (SQLException e) {
            System.out.println("Error: Email might already be registered.");
        }
    }

    public int login(String email, String password) {
        try (Connection connection = Dbconnection.connect();
             PreparedStatement statement = connection.prepareStatement(LOGIN_SQL)) {

            statement.setString(1, email);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                System.out.println("Login successful!");
                return resultSet.getInt("id");
            } else {
                System.out.println("Invalid email or password.");
                return -1;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
}
