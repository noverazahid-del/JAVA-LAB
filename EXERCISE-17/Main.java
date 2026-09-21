import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Student Registration Form");

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel rollLabel = new JLabel("Roll Number:");
        JTextField rollField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        JTextField courseField = new JTextField();

        JButton registerButton = new JButton("Register");

        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(rollLabel);
        frame.add(rollField);

        frame.add(courseLabel);
        frame.add(courseField);

        frame.add(new JLabel(""));
        frame.add(registerButton);

        registerButton.addActionListener(e -> {

            String name = nameField.getText();
            String roll = rollField.getText();
            String course = courseField.getText();

            JOptionPane.showMessageDialog(
                frame,
                "Student Registered Successfully!\n\n" +
                "Name: " + name +
                "\nRoll Number: " + roll +
                "\nCourse: " + course
            );
        });

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}