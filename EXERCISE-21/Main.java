import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    public static void main(String[] args) {

        Connection con = null;
        Statement stmt = null;

        try {

            // DriverManager establishes connection with database
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database connection established successfully!");

            // Connection object is used to create Statement
            stmt = con.createStatement();

            // Statement executes SQL query
            stmt.executeQuery("SELECT 1");

            System.out.println("Connection Status: CONNECTED");
            System.out.println("DriverManager: Successfully established connection.");
            System.out.println("Connection: Active database connection created.");
            System.out.println("Statement: SQL statement executed successfully.");

        } catch (Exception e) {

            System.out.println("Connection Status: NOT CONNECTED");
            System.out.println("Error: " + e.getMessage());

        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }

                if (con != null) {
                    con.close();
                }

            } catch (Exception e) {
                System.out.println("Error while closing database connection.");
            }
        }
    }
}