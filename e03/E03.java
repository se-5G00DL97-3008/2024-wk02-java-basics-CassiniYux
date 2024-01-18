import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
       
        // Create a Scanner object to read input
        Scanner scanner1 = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number:");
        double number1 = scanner.nextDouble();

        // Check if the number is positive or negative
        if (number1 > 0) {
            System.out.println("Positive number");
        } else if (number1 < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero");
        }
         scanner.close();
 
        Scanner scanner2 = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        double number2 = scanner.nextDouble();

        if (number2 > 0) {
            System.out.println("Positive number");
        } else if (number2 < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("The number is zero");
        }
        
        // Close the scanner
        scanner.close();
 
       
    }
}

