import java.util.Scanner;

class InvalidAgeException extends Exception {

    InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {

    static void checkLicenseEligibility(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                "You must be at least 18 years old to apply for a driving license."
            );
        }

        System.out.println("You are eligible for a driving license.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkLicenseEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}