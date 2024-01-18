import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
     // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Give a number: ");
        int num1 = scanner.nextDouble();
        System.out.println(num1);

        // Ask the user for the second number
        System.out.print("Give a number: ");
        int num2 = scanner.nextDouble();
        System.out.println(num2);

        // Perform calculations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        // Print the entered numbers and the results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        // Close the scanner
        scanner.close();

    }
}
