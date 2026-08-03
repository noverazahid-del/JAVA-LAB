public class Main {
    public static void main(String[] args) {

        // Primitive data types
        int num = 25;
        double price = 99.99;

        // Boxing (Primitive to Wrapper Object)
        Integer intObj = Integer.valueOf(num);
        Double doubleObj = Double.valueOf(price);

        // Display wrapper objects
        System.out.println("Integer Object: " + intObj);
        System.out.println("Double Object: " + doubleObj);

        // Unboxing (Wrapper Object to Primitive)
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();

        // Performing basic operations
        int sum = intValue + 10;
        double total = doubleValue + 50.50;

        // Display results
        System.out.println("Sum after adding 10: " + sum);
        System.out.println("Total after adding 50.50: " + total);

        // Converting String to Wrapper Object
        String str = "100";
        Integer number = Integer.parseInt(str);

        System.out.println("String converted to Integer: " + number);

        // Converting Wrapper Object to String
        String converted = intObj.toString();
        System.out.println("Integer converted to String: " + converted);
    }
}