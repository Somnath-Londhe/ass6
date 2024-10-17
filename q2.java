import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeeDetailsApp {
    // Declare the components for input frame
    private JFrame inputFrame;
    private JTextField enoField, eNameField, salField;
    private JButton submitButton;

    public EmployeeDetailsApp() {
        // Create the input frame
        inputFrame = new JFrame("Employee Details Input");
        inputFrame.setSize(300, 200);
        inputFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inputFrame.setLayout(new GridLayout(4, 2));

        // Initialize the input components
        inputFrame.add(new JLabel("Employee No:"));
        enoField = new JTextField(10);
        inputFrame.add(enoField);

        inputFrame.add(new JLabel("Employee Name:"));
        eNameField = new JTextField(10);
        inputFrame.add(eNameField);

        inputFrame.add(new JLabel("Salary:"));
        salField = new JTextField(10);
        inputFrame.add(salField);

        submitButton = new JButton("Submit");
        inputFrame.add(submitButton);

        // Add an empty label to maintain grid structure
        inputFrame.add(new JLabel());

        // Add action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get input values
                String eno = enoField.getText();
                String eName = eNameField.getText();
                String sal = salField.getText();

                // Call method to display details in new frame
                showEmployeeDetails(eno, eName, sal);
            }
        });

        // Set the frame to be visible
        inputFrame.setVisible(true);
    }

    // Method to display employee details in a new frame
    private void showEmployeeDetails(String eno, String eName, String sal) {
        // Create the output frame
        JFrame outputFrame = new JFrame("Employee Details");
        outputFrame.setSize(300, 150);
        outputFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        outputFrame.setLayout(new GridLayout(3, 1));

        // Display the employee details
        outputFrame.add(new JLabel("Employee No: " + eno));
        outputFrame.add(new JLabel("Employee Name: " + eName));
        outputFrame.add(new JLabel("Salary: " + sal));

        // Set the frame to be visible
        outputFrame.setVisible(true);
    }

    public static void main(String[] args) {
        // Run the application
        new EmployeeDetailsApp();
    }
}
