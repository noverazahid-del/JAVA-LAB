import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("GUI Calculator");

        JLabel firstLabel = new JLabel("First Number:");
        JTextField firstField = new JTextField();

        JLabel secondLabel = new JLabel("Second Number:");
        JTextField secondField = new JTextField();

        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");

        JLabel resultLabel = new JLabel("Result: ");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(firstLabel);
        frame.add(firstField);

        frame.add(secondLabel);
        frame.add(secondField);

        frame.add(addButton);
        frame.add(subtractButton);

        frame.add(resultLabel);

        addButton.addActionListener(e -> {

            double num1 = Double.parseDouble(firstField.getText());
            double num2 = Double.parseDouble(secondField.getText());

            double result = num1 + num2;

            resultLabel.setText("Result: " + result);
        });

        subtractButton.addActionListener(e -> {

            double num1 = Double.parseDouble(firstField.getText());
            double num2 = Double.parseDouble(secondField.getText());

            double result = num1 - num2;

            resultLabel.setText("Result: " + result);
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
