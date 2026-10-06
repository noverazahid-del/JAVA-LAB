import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("       HOSPITAL STAFF LOGIN");
        System.out.println("======================================");

        System.out.print("Enter Login ID: ");
        String loginId = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        String sql = "SELECT role FROM hospital_staff " +
                     "WHERE login_id = ? AND password = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(sql)) {

            // Set parameters
            ps.setString(1, loginId);
            ps.setString(2, password);

            // Execute query
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                String role = rs.getString("role");

                System.out.println("\n======================================");
                System.out.println("          LOGIN SUCCESSFUL");
                System.out.println("======================================");
                System.out.println("Login ID: " + loginId);
                System.out.println("Role: " + role);

                if (role.equalsIgnoreCase("Doctor")) {

                    System.out.println("Access Granted: Doctor Dashboard");

                } else if (role.equalsIgnoreCase("Nurse")) {

                    System.out.println("Access Granted: Nurse Dashboard");

                } else {

                    System.out.println("Access Granted.");

                }

            } else {

                System.out.println("\n======================================");
                System.out.println("          LOGIN FAILED");
                System.out.println("======================================");
                System.out.println("Invalid Login ID or Password.");
                System.out.println("Access Denied.");

            }

            rs.close();

        } catch (SQLException e) {

            System.out.println("\nDatabase error occurred.");
            e.printStackTrace();
        }

        sc.close();
    }
}