import java.util.Scanner;

class E05 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a number
        System.out.println("Enter a number: ");
        int dayNumber = scanner.nextInt();

      String day;
        switch (dayNumber) {
            case 1:
                day = "Mon";
                break;
            case 2:
                day = "Tue";
                break;
            case 3:
                day = "Wed";
                break;
            case 4:
                day = "Thu";
                break;
            case 5:
                day = "Fri";
                break;
            case 6:
                day = "Sat";
                break;
            case 7:
                day = "Sun";
                break;
            default:
                System.out.println("Only 7 days in a week");
                // Close the scanner
                scanner.close();
                return;  // Exit the program if the input is invalid
        }

        // Print the day
        System.out.println(day);

        // Close the scanner
        scanner.close();
    }
}
