import java.util.*;
import java.math.*;
public class math {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        double x = sc.nextDouble();
        System.out.print("Enter the number2: ");
        double y = sc.nextDouble();
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));  
        System.out.println("Square root of y is: " + Math.sqrt(y));  
        System.out.println("Power of x and y is: " + Math.pow(x, y));  
        System.out.println("Logarithm of x is: " + Math.log(x));  
        System.out.println("Logarithm of y is: " + Math.log(y));  
        System.out.println("return the logrithn of log10 of x is: " + Math.log10(x));
        sc.close();
    }
}
