import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Loop to display the menu and process user choices until the user chooses to exit
        do {
            displayMenu();
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt(); // Get the user's choice
            handleMenuChoice(choice); // Handle the selected choice
        } while (choice != 3); // Continue until the user chooses to exit

        System.out.println("Exiting program. Goodbye!");
        scanner.close(); // Close the scanner
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    // Method to execute the corresponding action based on the user's choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                // Exit message is printed in the main method
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        }
    }

    // Helper method to display a greeting message
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if a number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in); // New scanner to read user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Get the user's input
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
}
