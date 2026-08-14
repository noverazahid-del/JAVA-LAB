// Interface
interface Vehicle {
    void start();
}

// Parent class
class Car {
    String brand = "Toyota";

    void displayBrand() {
        System.out.println("Car Brand: " + brand);
    }
}

// Child class using inheritance and implementing interface
class ElectricCar extends Car implements Vehicle {

    // Implementing interface method
    public void start() {
        System.out.println("Electric car starts silently.");
    }

    void charge() {
        System.out.println("Electric car is charging.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object of child class
        ElectricCar car = new ElectricCar();

        // Inherited method
        car.displayBrand();

        // Interface method
        car.start();

        // Child class method
        car.charge();
    }
}