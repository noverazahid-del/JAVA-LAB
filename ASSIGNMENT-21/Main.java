import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {

    // Database details
    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            System.out.println("==============================================");
            System.out.println("       JDBC CLASSES AND INTERFACES");
            System.out.println("==============================================");

            // ------------------------------------------------
            // 1. DriverManager
            // ------------------------------------------------

            System.out.println("\n1. DRIVERMANAGER");
            System.out.println("----------------------------------------------");

            System.out.println("DriverManager is establishing connection...");

            connection = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("DriverManager: Connection established successfully.");

            // ------------------------------------------------
            // 2. Connection
            // ------------------------------------------------

            System.out.println("\n2. CONNECTION");
            System.out.println("----------------------------------------------");

            if (connection != null && !connection.isClosed()) {
                System.out.println("Connection: Database connection is active.");
            }

            System.out.println("Database URL: " + URL);
            System.out.println("User: " + USER);

            // ------------------------------------------------
            // 3. Statement
            // ------------------------------------------------

            System.out.println("\n3. STATEMENT");
            System.out.println("----------------------------------------------");

            statement = connection.createStatement();

            System.out.println("Statement object created successfully.");

            // Execute a simple SQL query
            resultSet = statement.executeQuery("SELECT 1");

            if (resultSet.next()) {
                System.out.println("Statement: SQL query executed successfully.");
                System.out.println("Query Result: " + resultSet.getInt(1));
            }

            // ------------------------------------------------
            // Final Status
            // ------------------------------------------------

            System.out.println("\n==============================================");
            System.out.println("             JDBC DEMONSTRATION");
            System.out.println("==============================================");
            System.out.println("DriverManager : WORKING");
            System.out.println("Connection    : ACTIVE");
            System.out.println("Statement     : WORKING");
            System.out.println("Database      : CONNECTED");
            System.out.println("==============================================");

        } catch (Exception e) {

            System.out.println("\n==============================================");
            System.out.println("             JDBC ERROR");
            System.out.println("==============================================");
            System.out.println("Database connection failed.");
            System.out.println("Error: " + e.getMessage());
            System.out.println("==============================================");

        } finally {

            // Close ResultSet
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing ResultSet.");
            }

            // Close Statement
            try {
                if (statement != null) {
                    statement.close();
                }
            } catch (Exception e) {
                System.out.println("Error closing Statement.");
            }

            // Close Connection
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("\nDatabase connection closed successfully.");
                }
            } catch (Exception e) {
                System.out.println("Error closing Connection.");
            }
        }
    }
}