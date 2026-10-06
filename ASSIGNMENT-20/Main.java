import java.sql.*;
import java.util.Scanner;

public class Main {

    // ================= DATABASE DETAILS =================
    static final String URL = "jdbc:mysql://localhost:3306/assignment20_db";
    static final String USER = "root";

    // CHANGE THIS TO YOUR MYSQL PASSWORD
    static final String PASSWORD = "Novera@1906/zahid";

    // ================= DATABASE CONNECTION =================
    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // =========================================================
    //                    STUDENT CRUD
    // =========================================================

    static void addStudent(Scanner sc) {

        String sql = "INSERT INTO students (roll_no, name, course, marks) VALUES (?, ?, ?, ?)";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            ps.setInt(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDouble(4, marks);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student added successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Error while adding student.");
            e.printStackTrace();
        }
    }

    static void viewStudents() {

        String sql = "SELECT * FROM students";

        try (Connection con = getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n========== STUDENT RECORDS ==========");

            boolean found = false;

            while (rs.next()) {

                found = true;

                System.out.println(
                    "Roll No: " + rs.getInt("roll_no") +
                    " | Name: " + rs.getString("name") +
                    " | Course: " + rs.getString("course") +
                    " | Marks: " + rs.getDouble("marks")
                );
            }

            if (!found) {
                System.out.println("No student records found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while displaying students.");
            e.printStackTrace();
        }
    }

    static void updateStudent(Scanner sc) {

        String sql = "UPDATE students SET name = ?, course = ?, marks = ? WHERE roll_no = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Roll Number to update: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Course: ");
            String course = sc.nextLine();

            System.out.print("Enter New Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setDouble(3, marks);
            ps.setInt(4, rollNo);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student updated successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while updating student.");
            e.printStackTrace();
        }
    }

    static void deleteStudent(Scanner sc) {

        String sql = "DELETE FROM students WHERE roll_no = ?";

        try (Connection con = getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            System.out.print("Enter Roll Number to delete: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            ps.setInt(1, rollNo);

            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Student deleted successfully!");
            } else {
                System.out.println("Student not found.");
            }

        } catch (SQLException e) {
            System.out.println("Error while deleting student.");
            e.printStackTrace();
        }
    }

    // =========================================================
    //                    EMPLOYEE CRUD
    // =========================================================

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

    // =========================================================
    //                         MAIN
    // =========================================================

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=================================");
            System.out.println("       JDBC CRUD APPLICATION");
            System.out.println("=================================");
            System.out.println("1. Student Management");
            System.out.println("2. Employee Management");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                // ================= STUDENT =================
                case 1:

                    while (true) {

                        System.out.println("\n----- STUDENT MANAGEMENT -----");
                        System.out.println("1. Add Student");
                        System.out.println("2. View Students");
                        System.out.println("3. Update Student");
                        System.out.println("4. Delete Student");
                        System.out.println("5. Back");
                        System.out.print("Enter choice: ");

                        int studentChoice = sc.nextInt();
                        sc.nextLine();

                        switch (studentChoice) {

                            case 1:
                                addStudent(sc);
                                break;

                            case 2:
                                viewStudents();
                                break;

                            case 3:
                                updateStudent(sc);
                                break;

                            case 4:
                                deleteStudent(sc);
                                break;

                            case 5:
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                        if (studentChoice == 5) {
                            break;
                        }
                    }

                    break;

                // ================= EMPLOYEE =================
                case 2:

                    while (true) {

                        System.out.println("\n----- EMPLOYEE MANAGEMENT -----");
                        System.out.println("1. Add Employee");
                        System.out.println("2. View Employees");
                        System.out.println("3. Update Employee");
                        System.out.println("4. Delete Employee");
                        System.out.println("5. Back");
                        System.out.print("Enter choice: ");

                        int employeeChoice = sc.nextInt();
                        sc.nextLine();

                        switch (employeeChoice) {

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
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                        if (employeeChoice == 5) {
                            break;
                        }
                    }

                    break;

                // ================= EXIT =================
                case 3:

                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}