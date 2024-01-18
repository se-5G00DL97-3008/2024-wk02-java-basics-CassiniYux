import java.util.Scanner;

class E03 {
    public static void main(String[] args) {
       // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user to enter a number
            System.out.println("Enter a number:");
            int number = scanner.nextInt();

            // Check if the number is positive, negative, or zero
            String result;
            if (number > 0) {
                result = "Positive number";
            } else if (number < 0) {
                result = "Negative number";
            } else {
                result = "The number is zero";
            }

            // Print the result
            System.out.println(result);
        }
       
    }
}

