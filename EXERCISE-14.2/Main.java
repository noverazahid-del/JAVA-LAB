import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter product quantity: ");
                int quantity = sc.nextInt();
                if (quantity <= 0) {
                    throw new Exception("Quantity must be greater than zero.");
                }
                System.out.println("Product quantity accepted: " + quantity);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}