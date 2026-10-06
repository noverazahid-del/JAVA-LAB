import java.sql.*;
import java.util.Scanner;

public class StudentCRUD {

    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    static Connection con;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

            while (true) {

                System.out.println("\n===== STUDENT CRUD MENU =====");
                System.out.println("1. Create Student");
                System.out.println("2. Read Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        createStudent();
                        break;

                    case 2:
                        readStudents();
                        break;

                    case 3:
                        updateStudent();
                        break;

                    case 4:
                        deleteStudent();
                        break;

                    case 5:
                        System.out.println("Program Exited.");
                        con.close();
                        return;

                    default:
                        System.out.println("Invalid choice!");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // CREATE
    static void createStudent() {

        try {
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();

            String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, course);
            ps.setDouble(4, marks);

            ps.executeUpdate();

            System.out.println("Student added successfully!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // READ
    static void readStudents() {

        try {
            String sql = "SELECT * FROM student";

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);

            System.out.println("\n===== STUDENT RECORDS =====");

            while (rs.next()) {

                System.out.println(
                    "Roll No: " + rs.getInt("roll_no") +
                    ", Name: " + rs.getString("name") +
                    ", Course: " + rs.getString("course") +
                    ", Marks: " + rs.getDouble("marks")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // UPDATE
    static void updateStudent() {

        try {
            System.out.print("Enter Roll Number to update: ");
            int rollNo = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Course: ");
            String course = sc.nextLine();

            System.out.print("Enter New Marks: ");
            double marks = sc.nextDouble();

            String sql =
                "UPDATE student SET name=?, course=?, marks=? WHERE roll_no=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setDouble(3, marks);
            ps.setInt(4, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student updated successfully!");
            else
                System.out.println("Student not found!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // DELETE
    static void deleteStudent() {

        try {
            System.out.print("Enter Roll Number to delete: ");
            int rollNo = sc.nextInt();

            String sql = "DELETE FROM student WHERE roll_no=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, rollNo);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Student deleted successfully!");
            else
                System.out.println("Student not found!");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}