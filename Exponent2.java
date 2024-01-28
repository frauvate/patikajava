import java.util.Scanner;

public class Exponent2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculateExponent(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    // Recursive method to calculate exponent
    private static double calculateExponent(double base, int exponent) {
        // Base case: if exponent is 0, result is 1
        if (exponent == 0) {
            return 1;
        }

        // Recursive case: multiply base by result of (base^(exponent-1))
        return base * calculateExponent(base, exponent - 1);
    }
}
