import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        // Check if the number is positive or negative
        if (number > 0) {
            System.out.println("Positive number");
        } else if (number < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero");
        }

        // Close the scanner
        scanner.close();
    }
}

