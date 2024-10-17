import java.util.Scanner;

public class q1 {
    // Recursive method to calculate power
    public static int power(int base, int exponent) {
        // Base case: any number raised to the power of 0 is 1
        if (exponent == 0) {
            return 1;
        }
        // Recursive case: base * base^(exponent - 1)
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Input base number
        System.out.print("Enter the base number: ");
        int base = scanner.nextInt();

        // Input exponent number
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        // Call the recursive power method and display the result
        int result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
