import java.util.*;
public class StringEmptyOrNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();    
        if (str1 == null || "".equals(str1)) {
            System.out.println("The entered string is either empty or null.");
        }
        else{
            System.out.println("The entered string is not empty and not null.");
        }
    }
}
