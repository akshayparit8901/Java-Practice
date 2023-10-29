//Java program to find ASCII Value of character
import java.util.*;
public class AsciiValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char ch = sc.next().charAt(0);
        int asciiVal = (int)ch;
        System.out.println("The ASCII value of " + ch + " is : "+asciiVal);
    }
}
