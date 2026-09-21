interface Product {
void displayProduct();
}
class ProductBase {
String name;
double price;
ProductBase(String name, double price) {
this.name = name;
this.price = price;
}
}
class Electronic extends ProductBase implements Product {
Electronic(String name, double price) {
super(name, price);
}
public void displayProduct() {
System.out.println("Electronic: " + name + "- " + price);
}
}
class Clothing extends ProductBase implements Product {
Clothing(String name, double price) {
super(name, price);
}
public void displayProduct() {
System.out.println("Clothing: " + name + "- " + price);
}
}
class Grocery extends ProductBase implements Product {
Grocery(String name, double price) {
super(name, price);
}
public void displayProduct() {
System.out.println("Grocery: " + name + "- " + price);
}
}
public class Main {
public static void main(String[] args) {
Electronic e = new Electronic("Laptop", 60000);
Clothing c = new Clothing("T-Shirt", 1000);
Grocery g = new Grocery("Rice", 800);
e.displayProduct();
c.displayProduct();
g.displayProduct();
}
}
