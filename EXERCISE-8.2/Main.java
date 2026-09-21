class Vehicle {
String vehicleNumber = "MH12AB1234";
String model = "Honda City";
void displayVehicle() {
System.out.println("Vehicle Number: " + vehicleNumber);
System.out.println("Model: " + model);
}
}
class CarInsurance extends Vehicle {
void displayInsurance() {
System.out.println("Car Insurance");
System.out.println("Vehicle Number: " + super.vehicleNumber);
System.out.println("Model: " + super.model);
}
}
class BikeInsurance extends Vehicle {
void displayInsurance() {
System.out.println("Bike Insurance");
System.out.println("Vehicle Number: " + super.vehicleNumber);
System.out.println("Model: " + super.model);
}
}
public class Main {
public static void main(String[] args) {
CarInsurance car = new CarInsurance();
car.displayInsurance();
System.out.println();
BikeInsurance bike = new BikeInsurance();
bike.displayInsurance();
    }
}