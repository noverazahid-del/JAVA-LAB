class Restaurant {
static int totalOrders = 0;
double bill(double food) {
totalOrders++;
return food;
}
double bill(double food, double tax) {
totalOrders++;
return food + tax;
}
double bill(double food, double tax, double delivery) {
totalOrders++;
return food + tax + delivery;
}
}
public class Main {
public static void main(String[] args) {
Restaurant r = new Restaurant();
System.out.println("Dine-in Bill: " + r.bill(500));
System.out.println("Takeaway Bill: " + r.bill(500, 50));
System.out.println("Delivery Bill: " + r.bill(500, 50, 40));
System.out.println("Total Orders: " + Restaurant.totalOrders);
}
}