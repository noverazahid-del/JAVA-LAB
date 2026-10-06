import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("         LOGIN APPLICATION");
        System.out.println("=================================");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String sql = "SELECT * FROM login_users WHERE username = ? AND password = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Set user input as parameters
            ps.setString(1, username);
            ps.setString(2, password);

            // Execute query
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("\nLogin successful!");
                System.out.println("Welcome, " + username + "!");

            } else {

                System.out.println("\nInvalid username or password.");
                System.out.println("Access denied.");

            }

            rs.close();

        } catch (SQLException e) {

            System.out.println("\nDatabase error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}