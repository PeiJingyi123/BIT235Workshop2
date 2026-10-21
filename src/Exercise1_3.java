/**
 * Exercise 1.3 - Area of a circle.
 *
 * Area = pi * radius * radius, using pi = 3.14.
 * Math.pow(radius, 2) is used to calculate radius squared.
 */
public class Exercise1_3 {

    /** Pi value required by the exercise. */
    private static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println("=== Exercise 1.3 : Area of a circle ===");
        System.out.printf("%-10s %-12s%n", "Radius", "Area");

        // Try the program with several different values for the radius.
        double[] radiusValues = {1, 2.5, 5, 10, 12.75};

        for (double radius : radiusValues) {
            double area = PI * Math.pow(radius, 2);
            System.out.printf("%-10.2f %-12.2f%n", radius, area);
        }
    }
}
