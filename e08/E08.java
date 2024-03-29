import java.util.Scanner;

class E08 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user to enter a number
            System.out.println("Give a number (0 to quit):");
            int number = scanner.nextInt();

            // Check if the number is 0 to quit
            if (number == 0) {
                break;
            }

            // Check if the number is odd or even using modulo %
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
