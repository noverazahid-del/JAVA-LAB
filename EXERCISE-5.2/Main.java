import java.util.ArrayList;import java.util.Scanner;
public class Main {
public static void main(String[] args) {
ArrayList<String> courses = new ArrayList<>();
Scanner sc = new Scanner(System.in);
courses.add("Java");
courses.add("DBMS");
courses.add("DSA");
System.out.println("Registered Courses:");
displayCourses(courses);
System.out.print("\nEnter course to add: ");
String addCourse = sc.nextLine();
courses.add(addCourse);
System.out.print("Enter course to remove: ");
String removeCourse = sc.nextLine();
courses.remove(removeCourse);
StringBuffer sb = new StringBuffer();
for (String course : courses) {
sb.append(course).append("\n");
}
System.out.println("\nFinal Course List:");
System.out.println(sb);
sc.close();
}
static void displayCourses(ArrayList<String> courses) {
for (String course : courses) {
System.out.println(course);
}
}
}
