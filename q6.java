import java.util.Scanner;
import java.util.Arrays;

class Employee {
    String name;

    // Constructor to initialize the employee name
    Employee(String name) {
        this.name = name;
    }

    // Static method to sort the array of employees by name
    public static void sortNames(Employee[] employees) {
        // Sort the employees array using a lambda function to compare names
        Arrays.sort(employees, (e1, e2) -> e1.name.compareToIgnoreCase(e2.name));
    }

    // Static method to display the employee names
    public static void displayEmployees(Employee[] employees) {
        System.out.println("Employee names in ascending order:");
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
    }
}

public class EmployeeSort {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array of Employee objects
        Employee[] employees = new Employee[n];

        // Accept employee names from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of employee " + (i + 1) + ": ");
            String name = scanner.nextLine();
            employees[i] = new Employee(name);
        }

        // Sort the employee names using the static method
        Employee.sortNames(employees);

        // Display the sorted employee names using the static method
        Employee.displayEmployees(employees);

        // Close the scanner
        scanner.close();
    }
}
