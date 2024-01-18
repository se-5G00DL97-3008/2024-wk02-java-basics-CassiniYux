import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplicand
        System.out.println("Which multiplication table to show?");
        int multiplicand = scanner.nextInt();

        // Ask the user until which multiplier
        System.out.println("Until which multiplier should the table show?");
        int multiplierLimit = scanner.nextInt();

        // Print the multiplication table until the desired multiplier
        for (int i = 0; i <= multiplierLimit; i++) {
            int result = i * multiplicand;
            System.out.println(i + " x " + multiplicand + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
