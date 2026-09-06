public class Main {
    public static void main(String[] args) {

        // Simple try-catch
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero.");
        }

        // Multiple catch blocks
        try {
            int[] numbers = {10, 20, 30};

            System.out.println("Element: " + numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred.");
        }

        // Nested try-catch
        try {
            System.out.println("Outer try block.");

            try {
                int result = 20 / 0;
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

        } catch (Exception e) {
            System.out.println("Outer catch: Exception occurred.");
        }
    }
}