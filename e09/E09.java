import java.util.Scanner;

class E09 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        while (true) {
            // Ask the teacher to give a test score
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            // Check if the teacher entered -1 to quit
            if (score == -1) {
                break;
            }

            // Add the score to the total
            total += score;
            count++;

            // Calculate and print the current average
            double average = (double) total / count;
            System.out.println("Average: " + average);
        }

        // Close the scanner
        scanner.close();
    }
}
