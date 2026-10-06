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

    // READ
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

    // UPDATE
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

    // DELETE
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n=================================");
            System.out.println("        STUDENT CRUD SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

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
                    System.out.println("Program terminated.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}