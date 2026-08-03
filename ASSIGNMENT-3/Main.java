class Calculator {

    // Static variable
    static String collegeName = "ABC Engineering College";

    // Static method
    static void displayCollege() {
        System.out.println("College Name: " + collegeName);
    }

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        // Calling static method
        Calculator.displayCollege();

        // Creating object
        Calculator obj = new Calculator();

        // Calling overloaded methods
        System.out.println("Sum of 10 and 20 = " + obj.add(10, 20));
        System.out.println("Sum of 10, 20 and 30 = " + obj.add(10, 20, 30));
        System.out.println("Sum of 12.5 and 7.5 = " + obj.add(12.5, 7.5));
    }
}
