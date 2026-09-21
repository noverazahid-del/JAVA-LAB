import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple Swing Application");

        JLabel label = new JLabel("Welcome to Java Swing!");

        JButton button = new JButton("Click Me");

        button.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                frame,
                "Button Clicked Successfully!"
            );
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