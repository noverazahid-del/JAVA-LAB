class Outer {
    String message = "Hello from Outer Class";

    // Inner Class
    class Inner {
        void display() {
            System.out.println("Inner Class:");
            System.out.println(message);
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating object of Outer class
        Outer outer = new Outer();

        // Creating object of Inner class
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Anonymous Class
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("\nAnonymous Class:");
                System.out.println("This method is implemented without creating a separate class.");
            }
        };

        r.run();
    }
}