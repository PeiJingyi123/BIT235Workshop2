import java.util.Scanner;

/**
 * Exercise 1.8 - Compare two strings.
 *
 * The user enters two strings. The program
 *   1. compares them with equals(Object anObject) and displays whether they
 *      are equal ("the two given strings are equal: true / false")
 *   2. compares the first character of each string with charAt(int index)
 */
public class Exercise1_8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Exercise 1.8 : Compare two strings ===");

        System.out.print("Enter the first string  : ");
        String firstString = input.nextLine();

        System.out.print("Enter the second string : ");
        String secondString = input.nextLine();

        // 1. Whole string comparison using equals(Object anObject).
        boolean areEqual = firstString.equals(secondString);

        System.out.println();
        System.out.println("First string  : \"" + firstString + "\"");
        System.out.println("Second string : \"" + secondString + "\"");
        System.out.println("The two given strings are equal: " + areEqual);

        // 2. Compare the first character of each string.
        if (firstString.isEmpty() || secondString.isEmpty()) {
            System.out.println("Cannot compare first characters: one of the strings is empty.");
        } else {
            char firstChar1 = firstString.charAt(0);
            char firstChar2 = secondString.charAt(0);
            boolean sameFirstChar = (firstChar1 == firstChar2);

            System.out.println("First character of string 1 : '" + firstChar1 + "'");
            System.out.println("First character of string 2 : '" + firstChar2 + "'");
            System.out.println("The first characters are the same: " + sameFirstChar);
        }

        input.close();
    }
}
