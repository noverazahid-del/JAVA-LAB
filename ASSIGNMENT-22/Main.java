import java.sql.*;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {

            System.out.println("==============================================");
            System.out.println("   JDBC PREPAREDSTATEMENT AND RESULTSET");
            System.out.println("==============================================");

            // Establish database connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("\nDatabase connected successfully.");

            // ------------------------------------------------
            // PreparedStatement Demonstration
            // ------------------------------------------------

            System.out.println("\n1. PREPAREDSTATEMENT");
            System.out.println("----------------------------------------------");

            String sql = "SELECT roll_no, name, course, marks FROM students WHERE marks >= ?";

            ps = con.prepareStatement(sql);

            System.out.println("PreparedStatement created successfully.");

            // Set parameter
            ps.setDouble(1, 0);

            // Execute query
            rs = ps.executeQuery();

            System.out.println("SQL query executed successfully.");

            // ------------------------------------------------
            // ResultSet Demonstration
            // ------------------------------------------------

            System.out.println("\n2. RESULTSET");
            System.out.println("----------------------------------------------");

            System.out.println("Student Records:");

            boolean found = false;

            while (rs.next()) {

                found = true;

                int rollNo = rs.getInt("roll_no");
                String name = rs.getString("name");
                String course = rs.getString("course");
                double marks = rs.getDouble("marks");

                System.out.println(
                    "Roll No: " + rollNo +
                    " | Name: " + name +
                    " | Course: " + course +
                    " | Marks: " + marks
                );
            }

            if (!found) {
                System.out.println("No student records found.");
            }

            // ------------------------------------------------
            // Final Status
            // ------------------------------------------------

            System.out.println("\n==============================================");
            System.out.println("          JDBC DEMONSTRATION");
            System.out.println("==============================================");
            System.out.println("PreparedStatement : WORKING");
            System.out.println("ResultSet         : WORKING");
            System.out.println("Database          : CONNECTED");
            System.out.println("==============================================");

        } catch (SQLException e) {

            System.out.println("\nDatabase error occurred.");
            e.printStackTrace();

        } finally {

            try {
                if (rs != null) {
                    rs.close();
                }

                if (ps != null) {
                    ps.close();
                }

                if (con != null) {
                    con.close();
                }

                System.out.println("\nDatabase resources closed successfully.");

            } catch (SQLException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}