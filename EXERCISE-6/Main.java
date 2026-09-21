class Vehicle {
String brand = "Toyota";
String model = "Camry";
class Details {
void display() {
System.out.println("Brand: " + brand);
System.out.println("Model: " + model);
}
}
}
public class Main {
public static void main(String[] args) {
Vehicle vehicle = new Vehicle();
Vehicle.Details details = vehicle.new Details();
details.display();
Runnable action = new Runnable() {
public void run() {
System.out.println("Vehicle is starting.");
}
};
action.run();
}
}