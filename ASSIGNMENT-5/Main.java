import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // ArrayList Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("ArrayList Elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Vector Example
        Vector<Integer> numbers = new Vector<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nVector Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // StringBuffer Example
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(5, "Language ");
        sb.replace(0, 4, "Core");
        sb.delete(5, 14);

        System.out.println("\nStringBuffer Output:");
        System.out.println(sb);
    }
}