class Parent {
    String name = "Parent Class";

    void display() {
        System.out.println("This is the Parent class.");
    }
}

class Child extends Parent {
    String name = "Child Class";

    void display() {
        System.out.println("This is the Child class.");
    }

    void showDetails() {
        // Accessing parent class variable
        System.out.println("Parent Variable: " + super.name);

        // Calling parent class method
        super.display();

        // Accessing child class variable
        System.out.println("Child Variable: " + name);

        // Calling child class method
        display();
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.showDetails();
    }
}