import java.util.Scanner;

class Student {
    // Variables
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to calculate birth year
    void calculateBirthYear() {
        int currentYear = 2026;
        int birthYear = currentYear - age;
        System.out.println("Approximate Birth Year: " + birthYear);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accepting input
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int age = sc.nextInt();

        // Creating object using constructor
        Student s1 = new Student(name, age);

        // Calling methods
        s1.displayDetails();
        s1.calculateBirthYear();

        sc.close();
    }
}