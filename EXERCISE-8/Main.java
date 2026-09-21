class Employee {
String name = "Ali";
int id = 101;
void display() {
System.out.println("Employee Name: " + name);
System.out.println("Employee ID: " + id);
}
}
class Manager extends Employee {
String name = "Ahmed";
void showDetails() {
System.out.println("Manager Name: " + name);
System.out.println("Employee Name using super: " + super.name);
System.out.println("Employee ID using super: " + super.id);
super.display();
}
}
public class Main {
public static void main(String[] args) {
Manager m = new Manager();
m.showDetails();
    }
}