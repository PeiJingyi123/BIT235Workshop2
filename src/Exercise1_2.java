/**
 * Exercise 1.2 - Convert degrees Celsius to degrees Fahrenheit.
 *
 * Formula: F = C * 9 / 5 + 32
 *
 * Note: 9 / 5 must be written as 9.0 / 5.0, otherwise integer division
 * (9 / 5 = 1) would give a wrong answer.
 */
public class Exercise1_2 {

    public static void main(String[] args) {
        System.out.println("=== Exercise 1.2 : Celsius -> Fahrenheit ===");
        System.out.printf("%-12s %-12s%n", "Celsius", "Fahrenheit");

        // Several sample values, including the two check points 0 C = 32 F
        // and 100 C = 212 F.
        double[] celsiusValues = {0, 37, 100, -40};

        for (double celsius : celsiusValues) {
            double fahrenheit = celsius * 9.0 / 5.0 + 32;
            System.out.printf("%-12.2f %-12.2f%n", celsius, fahrenheit);
        }
    }
}
