import java.util.*;
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        //Adding two numbers using addition operator (+).
        int sum = num1 + num2;
        System.out.print("The sum of " + num1 + " and " + num2 + " is : "+sum+".");
    }
}
