/**
 * Exercise 1.5 - Volumes of the Earth and the Sun.
 *
 * Volume of a sphere = (4 / 3) * pi * r^3, where r = diameter / 2 and pi = 3.14.
 *
 * Note: (4 / 3) must be written as (4.0 / 3.0). With integers, 4 / 3 = 1.
 */
public class Exercise1_5 {

    private static final double PI = 3.14;
    private static final double SUN_DIAMETER = 865000;    // miles
    private static final double EARTH_DIAMETER = 7600;    // miles

    public static void main(String[] args) {
        double earthRadius = EARTH_DIAMETER / 2;
        double sunRadius = SUN_DIAMETER / 2;

        double earthVolume = (4.0 / 3.0) * PI * Math.pow(earthRadius, 3);
        double sunVolume = (4.0 / 3.0) * PI * Math.pow(sunRadius, 3);
        double ratio = sunVolume / earthVolume;

        System.out.println("=== Exercise 1.5 : Volume of the Earth and the Sun ===");
        System.out.printf("Sun diameter           : %,.0f miles%n", SUN_DIAMETER);
        System.out.printf("Earth diameter         : %,.0f miles%n", EARTH_DIAMETER);
        System.out.println("-----------------------------------------------------");
        System.out.printf("a) Volume of the Earth : %s cubic miles%n", format(earthVolume));
        System.out.printf("b) Volume of the Sun   : %s cubic miles%n", format(sunVolume));
        System.out.printf("c) Sun / Earth ratio   : %s%n", format(ratio));
        System.out.println("-----------------------------------------------------");
        System.out.printf("The Sun is about %s times larger than the Earth.%n", format(ratio));
    }

    /**
     * Formats very large / very small numbers in scientific notation so that
     * the result stays readable (e.g. 3.38709E+17).
     */
    private static String format(double value) {
        if (value >= 1e12) {
            return String.format("%.4e", value);
        }
        return String.format("%,.2f", value);
    }
}
