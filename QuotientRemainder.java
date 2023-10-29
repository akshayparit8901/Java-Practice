//Java program to compute quotient AND remainder
import java.util.*;
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int num2 = sc.nextInt();
        if (num2 != 0){
            int quo = num1 / num2;
            int rem = num1 % num2;
            System.out.println("Quotient is " + quo);
            System.out.println("Remainder is " + rem);
        }
        else{
            System.out.println("Divisor cannot be zero");
        }
    }
}
