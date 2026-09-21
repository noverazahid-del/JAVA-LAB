import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Bank Balance Calculator");

        JLabel balanceLabel = new JLabel("Initial Balance:");
        JTextField balanceField = new JTextField();

        JLabel amountLabel = new JLabel("Transaction Amount:");
        JTextField amountField = new JTextField();

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");

        JLabel resultLabel = new JLabel("Updated Balance: ");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(balanceLabel);
        frame.add(balanceField);

        frame.add(amountLabel);
        frame.add(amountField);

        frame.add(depositButton);
        frame.add(withdrawButton);

        frame.add(resultLabel);

        depositButton.addActionListener(e -> {

            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            balance = balance + amount;

            resultLabel.setText("Updated Balance: " + balance);
        });

        withdrawButton.addActionListener(e -> {

            double balance = Double.parseDouble(balanceField.getText());
            double amount = Double.parseDouble(amountField.getText());

            balance = balance - amount;

            resultLabel.setText("Updated Balance: " + balance);
        });

        frame.setSize(450, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}