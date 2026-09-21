public class Main {

    static void checkNumber(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Negative number is not allowed.");
        }

        System.out.println("Number is valid: " + number);
    }

    public static void main(String[] args) {

        try {
            checkNumber(-5);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}