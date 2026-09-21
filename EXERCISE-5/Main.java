import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
ArrayList<String> tasks = new ArrayList<>();
tasks.add("Complete Java Assignment");
tasks.add("Study DSA");
tasks.add("Submit Lab Record");
StringBuffer sb = new StringBuffer();
for (String task : tasks) {
sb.append(task).append("\n");
}
System.out.println("To-Do List:");
System.out.println(sb);
}
}