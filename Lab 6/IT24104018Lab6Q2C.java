import java.util.Scanner;

public class IT24104018Lab6Q2C {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int count = 1;
        int sum = 0;

        while (count <= 10) {

            System.out.print("Enter number " + count + ": ");
            int number = input.nextInt();

            sum = sum + number;

            count++;
        }

        double average = sum / 10.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}