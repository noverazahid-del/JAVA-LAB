abstract class FoodOrder {
abstract void calculateBill();
}
class DineInOrder extends FoodOrder {
double foodPrice = 500;
double serviceCharge = 50;
void calculateBill() {
double total = foodPrice + serviceCharge;
System.out.println("Dine-In Bill: Rs." + total);
}
}
class TakeAwayOrder extends FoodOrder {
double foodPrice = 500;
double packagingCharge = 20;
void calculateBill() {
double total = foodPrice + packagingCharge;
System.out.println("Take-Away Bill: Rs." + total);
}
}
public class Main {
public static void main(String[] args) {
DineInOrder dineIn = new DineInOrder();
TakeAwayOrder takeAway = new TakeAwayOrder();
dineIn.calculateBill();
takeAway.calculateBill();
}
}
