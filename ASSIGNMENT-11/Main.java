interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {

    public void start() {
        System.out.println("Car starts.");
    }

    public void stop() {
        System.out.println("Car stops.");
    }
}

class Bike implements Vehicle {

    public void start() {
        System.out.println("Bike starts.");
    }

    public void stop() {
        System.out.println("Bike stops.");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}