class BankAccount {
final int accountNumber;
String name;
double balance;
BankAccount(int accountNumber, String name, double balance) {
this.accountNumber = accountNumber;
this.name = name;
this.balance = balance;
}
void display() {
System.out.println("Account Number: " + accountNumber);
System.out.println("Name: " + name);
System.out.println("Balance: " + balance);
}
}
public class Main {
public static void main(String[] args) {
BankAccount account = new BankAccount(1001, "Ali", 25000);
account.display();
// account.accountNumber = 2002;
// Cannot change because accountNumber is final.
    }
}