import java.util.Scanner;

/**
 * Exercise 1.1 - Difference of two numbers.
 *
 * The user enters two integers; the program calculates their difference
 * and displays the result.
 */
public class Exercise1_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Exercise 1.1 : Difference of two integers ===");

        System.out.print("Enter the first integer  : ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second integer : ");
        int secondNumber = input.nextInt();

        // difference = first - second
        int difference = firstNumber - secondNumber;

        System.out.println();
        System.out.println("Calculation : " + firstNumber + " - " + secondNumber
                + " = " + difference);
        System.out.println("The difference of the two numbers is " + difference + ".");

        input.close();
    }
}
