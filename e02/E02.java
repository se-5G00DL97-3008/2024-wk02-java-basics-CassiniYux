import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Give a number:");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.println("Give another number:");
        double num2 = scanner.nextDouble();

        // Perform operations
        double sum = num1 + num2;
        double product = num1 * num2;
        double difference = num1 - num2;
        double quotient = num1 / num2;

        // Print the results
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + product);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " / " + num2 + " = " + quotient);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
