import java.util.Scanner;

public class IT24104018Lab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int count = 0;
        double sumOfSquares = 0;

        System.out.println("Enter positive numbers (-99 to stop):");

        while (true) {

            System.out.print("Enter number: ");
            number = input.nextInt();

            // Stop the program when -99 is entered
            if (number == -99) {
                break;
            }

            // Validate negative numbers
            if (number < 0) {
                System.out.println("Invalid input! Enter a positive number.");
                continue;
            }

            // Add square of the number
            sumOfSquares = sumOfSquares + (number * number);

            // Count valid numbers
            count++;
        }

        if (count > 0) {

            double mean = sumOfSquares / count;
            double rms = Math.sqrt(mean);

            System.out.println("Number of values = " + count);
            System.out.println("Sum of squares = " + sumOfSquares);
            System.out.println("Root Mean Square = " + rms);

        } else {
            System.out.println("No valid numbers were entered.");
        }

        input.close();
    }
}