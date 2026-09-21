import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Employee Registration Form");

        JLabel idLabel = new JLabel("Employee ID:");
        JTextField idField = new JTextField();

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel deptLabel = new JLabel("Department:");
        JTextField deptField = new JTextField();

        JLabel salaryLabel = new JLabel("Salary:");
        JTextField salaryField = new JTextField();

        JButton registerButton = new JButton("Register");

        frame.setLayout(new GridLayout(5, 2, 10, 10));

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(deptLabel);
        frame.add(deptField);

        frame.add(salaryLabel);
        frame.add(salaryField);

        frame.add(new JLabel(""));
        frame.add(registerButton);

        registerButton.addActionListener(e -> {

            String id = idField.getText();
            String name = nameField.getText();
            String department = deptField.getText();
            String salary = salaryField.getText();

            JOptionPane.showMessageDialog(
                frame,
                "Employee Details\n\n" +
                "Employee ID: " + id +
                "\nName: " + name +
                "\nDepartment: " + department +
                "\nSalary: " + salary
            );
        });

        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}