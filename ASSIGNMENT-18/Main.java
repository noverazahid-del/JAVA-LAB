import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Button Click Event");

        JLabel label = new JLabel("Click the button:");

        JButton button = new JButton("Click Me");

        button.addActionListener(e -> {
            label.setText("Button was clicked!");
        });

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(button);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}