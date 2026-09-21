class FoodOrder {
String food = "Pizza";
int quantity = 2;
class OrderDetails {
void display() {
System.out.println("Food: " + food);
System.out.println("Quantity: " + quantity);
}
}
}
public class Main {
public static void main(String[] args) {
FoodOrder order = new FoodOrder();
FoodOrder.OrderDetails details = order.new OrderDetails();
details.display();
Runnable status1 = new Runnable() {
public void run() {
System.out.println("Order Status: Preparing");
}
};
Runnable status2 = new Runnable() {
public void run() {
System.out.println("Order Status: Out for Delivery");
}
};
status1.run();
status2.run();
}
}