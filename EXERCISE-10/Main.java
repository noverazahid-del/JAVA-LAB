abstract class Payment {
abstract void pay(double amount);
}
class CreditCard extends Payment {
void pay(double amount) {
System.out.println("Paid Rs." + amount + " using Credit Card.");
}
}
class UPI extends Payment {
void pay(double amount) {
System.out.println("Paid Rs." + amount + " using UPI.");
}
}
public class Main {
public static void main(String[] args) {
CreditCard card = new CreditCard();
UPI upi = new UPI();
card.pay(5000);
upi.pay(2500);
}
}