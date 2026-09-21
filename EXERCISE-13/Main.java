import java.io.FileWriter;import java.io.FileReader;import
java.io.IOException;
public class Main {
public static void main(String[] args) {
String fileName = "employee.txt";
try {
FileWriter writer = new FileWriter(fileName);
writer.write("Employee ID: 101\n");
writer.write("Name: Ali\n");
writer.write("Department: IT\n");
writer.write("Salary: 50000\n");
writer.close();
System.out.println("Employee details written successfully.");
FileReader reader = new FileReader(fileName);
int ch;
System.out.println("\nEmployee Details:");
while ((ch = reader.read()) !=-1) {
System.out.print((char) ch);
}
reader.close();
} catch (IOException e) {
System.out.println("Error: " + e.getMessage());
}
}
}
