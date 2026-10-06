import java.sql.*;
import java.util.Scanner;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";
    static final String PASSWORD = "Novera@1906/zahid";

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // CREATE
    static void addEmployee(Scanner sc) {

        String sql = "INSERT INTO employees (name, department, salary) VALUES (?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            ps.setString(1, name);
            ps.setString(2, department);
            ps.setDouble(3, salary);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee added successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error while adding employee.");
            e.printStackTrace();
        }
    }

    // READ
    static void viewEmployees() {

        String sql = "SELECT * FROM employees";

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n========== EMPLOYEE RECORDS ==========");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                    "ID: " + rs.getInt("id") +
                    " | Name: " + rs.getString("name") +
                    " | Department: " + rs.getString("department") +
                    " | Salary: " + rs.getDouble("salary")
                );
            }

            if (!found) {
                System.out.println("No employee records found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while displaying employees.");
            e.printStackTrace();
        }
    }

    // UPDATE
    static void updateEmployee(Scanner sc) {

        String sql = "UPDATE employees SET name = ?, department = ?, salary = ? WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Department: ");
            String department = sc.nextLine();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            ps.setString(1, name);
            ps.setString(2, department);
            ps.setDouble(3, salary);
            ps.setInt(4, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee updated successfully!");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while updating employee.");
            e.printStackTrace();
        }
    }

    // DELETE
    static void deleteEmployee(Scanner sc) {

        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Employee ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();

            ps.setInt(1, id);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Employee deleted successfully!");
            } else {
                System.out.println("Employee not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while deleting employee.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       EMPLOYEE CRUD SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addEmployee(sc);
                    break;

                case 2:
                    viewEmployees();
                    break;

                case 3:
                    updateEmployee(sc);
                    break;

                case 4:
                    deleteEmployee(sc);
                    break;

                case 5:
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}