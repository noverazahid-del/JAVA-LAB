import java.io.FileWriter;import java.io.FileReader;import
java.io.IOException;
public class Main {
public static void main(String[] args) {
String fileName = "patient.txt";
try {
FileWriter writer = new FileWriter(fileName);
writer.write("Patient ID: P101\n");
writer.write("Name: Ahmed\n");
writer.write("Age: 35\n");
writer.write("Diagnosis: Fever\n");
writer.close();
System.out.println("Patient details written successfully.");
FileReader reader = new FileReader(fileName);
int ch;
System.out.println("\nPatient Details:");
while ((ch = reader.read()) !=-1) {
System.out.print((char) ch);
}
reader.close();
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}