abstract class Shape {

    // Abstract method
    abstract void area();

    // Normal method
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    int radius = 5;

    // Implementing abstract method
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    int length = 10;
    int width = 5;

    // Implementing abstract method
    void area() {
        int result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.display();
        c.area();

        Rectangle r = new Rectangle();
        r.display();
        r.area();
    }
}