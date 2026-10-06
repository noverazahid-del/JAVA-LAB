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

            // DriverManager establishes connection
            con = DriverManager.getConnection(URL, USER, PASSWORD);

            // Connection object creates Statement
            stmt = con.createStatement();

            // Execute a simple SQL query
            stmt.executeQuery("SELECT 1");

            System.out.println("======================================");
            System.out.println("       STUDENT DATABASE");
            System.out.println("======================================");
            System.out.println("Student database connected successfully!");
            System.out.println("Connection Status: CONNECTED");
            System.out.println("DriverManager: Connection established.");
            System.out.println("Connection: Active connection available.");
            System.out.println("Statement: SQL query executed successfully.");
            System.out.println("======================================");

        } catch (Exception e) {

            System.out.println("======================================");
            System.out.println("       STUDENT DATABASE");
            System.out.println("======================================");
            System.out.println("Student database connection failed!");
            System.out.println("Connection Status: NOT CONNECTED");
            System.out.println("Error: " + e.getMessage());
            System.out.println("======================================");

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