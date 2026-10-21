/**
 * Exercise 1.6 - Fuel consumption.
 *
 * Normal road : 8 litres / 100 km
 * Rough road  : 15% more fuel, i.e. 8 * 1.15 = 9.2 litres / 100 km
 * Tank        : 40 litres
 *
 * Distance = (tank capacity / consumption per km) = litres / (litres per 100 km) * 100
 */
public class Exercise1_6 {

    public static void main(String[] args) {
        final double TANK = 40;                 // litres
        final double NORMAL_CONSUMPTION = 8;    // litres per 100 km
        final double ROUGH_INCREASE = 0.15;     // 15% more fuel

        double roughConsumption = NORMAL_CONSUMPTION * (1 + ROUGH_INCREASE);

        // Distance (km) = litres / (litres per 100 km) * 100
        double normalDistance = TANK / NORMAL_CONSUMPTION * 100;
        double roughDistance = TANK / roughConsumption * 100;

        System.out.println("=== Exercise 1.6 : Fuel Consumption ===");
        System.out.printf("Tank capacity                : %.0f litres%n", TANK);
        System.out.printf("Normal road consumption      : %.2f L / 100 km%n", NORMAL_CONSUMPTION);
        System.out.printf("Rough road consumption       : %.2f L / 100 km (15%% more)%n", roughConsumption);
        System.out.println("--------------------------------------------------");
        System.out.printf("Distance on normal roads     : %.2f km%n", normalDistance);
        System.out.printf("Distance on rough roads      : %.2f km%n", roughDistance);
        System.out.printf("Difference                   : %.2f km%n",
                normalDistance - roughDistance);
    }
}
