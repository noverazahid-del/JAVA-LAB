import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                System.out.print("Enter withdrawal amount: ");
                double amount = sc.nextDouble();
                if (amount <= 0) {
                    throw new Exception("Invalid withdrawal amount.");
                }
                System.out.println("Withdrawal successful.");
                System.out.println("Amount withdrawn: Rs." + amount);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}