import java.util.Scanner;

public class SumOfDigits {

    // Recursive method to calculate the sum of digits
    public static int sumOfDigits(int number) {
        // Base case: if the number is 0, return 0
        if (number == 0) {
            return 0;
        }
        // Recursive case: add the last digit to the sum of digits of the rest of the number
        return (number % 10) + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Call the recursive method and display the result
        int result = sumOfDigits(number);
        System.out.println("The sum of digits of " + number + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
