import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user which multiplication table to show
        System.out.println("Which multiplication table to show?");
        int multiplier = scanner.nextInt();

        // Print the multiplication table until 10
        for (int i = 0; i <= 10; i++) {
            int result = i * multiplier;
            System.out.println(i + " x " + multiplier + " = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
