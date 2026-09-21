

class Student {
    String name = "Alice";
    int rollNo = 101;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class Faculty {
    String name = "Mr. Smith";
    String department = "Computer Science";

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        Faculty f = new Faculty();

        System.out.println("Student Details:");
        s.display();

        System.out.println("\nFaculty Details:");
        f.display();
    }
}
