import java.util.*;
public class RoundNumberToNDecimalPlaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = sc.nextDouble();
        int decimalPlace;
        System.out.print("Enter the number of decimal places to round to: ");
        decimalPlace = sc.nextInt();
        // Calculate and print rounded number with specified decimal place
        String formatStr = "%." + decimalPlace + "f";
        System.out.printf(formatStr, Math.round(num * (10 ^ decimalPlace)) / (double)(10 ^
        decimalPlace));
    }
}
