import java.util.Scanner;

public class NameSearch {
    public static void main(String[] args) {
        // Array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the name to search
        System.out.print("Enter the name to search: ");
        String searchName = scanner.nextLine();

        // Flag to indicate if the name is found
        boolean found = false;

        // Search the name in the array
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println(searchName + " found at index " + i);
                found = true;
                break;
            }
        }

        // If name is not found, display an appropriate message
        if (!found) {
            System.out.println(searchName + " not found in the array.");
        }

        // Close the scanner
        scanner.close();
    }
}
