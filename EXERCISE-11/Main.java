interface Printable {
void print();
}
class Student implements Printable {
public void print() {
System.out.println("Student details are displayed.");
}
}
class Employee implements Printable {
public void print() {
System.out.println("Employee details are displayed.");
}
}
public class Main {
public static void main(String[] args) {
Student s = new Student();
Employee e = new Employee();
s.print();
e.print();
}
}