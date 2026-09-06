import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String fileName = "data.txt";

        try {
            FileWriter writer = new FileWriter(fileName);

            writer.write("Hello, this is Java File Handling.\n");
            writer.write("This file was created using Java.");

            writer.close();

            System.out.println("Data written to file successfully.");

            FileReader reader = new FileReader(fileName);

            int ch;

            System.out.println("\nData read from file:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}