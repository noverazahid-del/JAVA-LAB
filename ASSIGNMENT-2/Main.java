class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    // Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        // Object using Default Constructor
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        s1.display();

        // Object using Parameterized Constructor
        Student s2 = new Student("Alice", 20);
        System.out.println("Parameterized Constructor:");
        s2.display();

        // Object using Copy Constructor
        Student s3 = new Student(s2);
        System.out.println("Copy Constructor:");
        s3.display();
    }
}