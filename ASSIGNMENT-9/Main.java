class Parent {
    // Final variable
    final int number = 100;

    // Final method
    final void display() {
        System.out.println("This is a final method.");
    }
}

// Final class
final class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Final variable
        Parent obj = new Parent();
        System.out.println("Final Variable: " + obj.number);

        // Final method
        obj.display();

        // Final class
        FinalClass fc = new FinalClass();
        fc.show();
    }
}