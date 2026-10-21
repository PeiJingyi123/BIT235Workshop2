/**
 * Exercise 1.4 - Compound interest.
 *
 * Formula: A = P * (1 + r)^n
 *   A = amount (future value)
 *   P = principal
 *   r = interest rate per time period
 *   n = number of time periods
 *
 * Given: P = $5000.00, r = 4% per year, n = 10 years.
 * Math.pow(base, n) is used to calculate the power multiplier.
 */
public class Exercise1_4 {

    public static void main(String[] args) {
        double principal = 5000.00;   // P
        double rate = 0.04;           // r = 4%
        int years = 10;               // n

        double amount = principal * Math.pow(1 + rate, years);
        double interestEarned = amount - principal;

        System.out.println("=== Exercise 1.4 : Compound Interest ===");
        System.out.printf("Principal (P)          : $%,.2f%n", principal);
        System.out.printf("Interest rate (r)      : %.0f%% per year%n", rate * 100);
        System.out.printf("Time periods (n)       : %d years%n", years);
        System.out.println("------------------------------------------------");
        System.out.printf("Formula                : A = %.2f * (1 + %.2f)^%d%n",
                principal, rate, years);
        System.out.printf("Amount (A)             : $%,.2f%n", amount);
        System.out.printf("Interest earned        : $%,.2f%n", interestEarned);
        System.out.println("------------------------------------------------");
        System.out.printf("After %d years, $%,.2f grows to $%,.2f.%n",
                years, principal, amount);
    }
}
