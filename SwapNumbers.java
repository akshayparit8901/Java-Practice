//Java program to swap two numbers
import java.util.*;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        //Swapping of numbers using temporary variable
        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
    }
}
