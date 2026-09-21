public class Main {
public static void main(String[] args) {
String marks1 = "85";
String marks2 = "90";
String marks3 = "75";
Integer m1 = Integer.valueOf(marks1);
Integer m2 = Integer.valueOf(marks2);
Integer m3 = Integer.valueOf(marks3);
int total = m1 + m2 + m3;
System.out.println("Marks 1: " + m1);
System.out.println("Marks 2: " + m2);
System.out.println("Marks 3: " + m3);
System.out.println("Total Marks: " + total);
}
}