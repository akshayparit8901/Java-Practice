import java.math.*;
public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        double a = 1; // coefficient of x^2 in the quadratic equation ax^2 + bx + c = 0
        double b = -3; // coefficient of x in the quadratic equation ax^2 + bx + c = 0
        double c = -4; // constant term in the quadratic equation ax^2 + bx + c = 0
        System.out.println("The roots of the given quadratic equation are: " + findRoots(a,b,c));
    }
    private static String findRoots(double a, double b, double c){
        double root1, root2;
        double det = Math.pow(b, 2)-(4*a*c);
        if (det>0){
            root1 = (-b+Math.sqrt(det))/(2*a);
            root2 = (-b-Math.sqrt(det))/(2*a);  
            return ("Root1= "+root1+" and Root2= "+root2);
        }
        else if (det==0){
            root1=(-b)/(2*a);
            return ("Both roots are real and same i.e., "+root1);   
        }
        else{
            double realPart=-b/(2*a);
            double imaginaryPart=Math.sqrt((-det)/(4*a));
            return ("Both roots are complex and different."+"\n"+"Real part is "+realPart+" and Imaginary Part is "+imaginaryPart);
        }
    }
}
