class Shape {
void display() {
System.out.println("This is a shape.");
}
}
class Circle extends Shape {
double radius = 5;
void area() {
System.out.println("Area of Circle: " + (3.14 * radius * radius));
}
}
class Rectangle extends Shape {
double length = 10;
double width = 5;
void area() {
System.out.println("Area of Rectangle: " + (length * width));
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