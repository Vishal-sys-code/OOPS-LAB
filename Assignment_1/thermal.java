//fahrenheit to celcius

// C/5 = (F-32)/9
// (9C/5)+32 = F
// C = (5F-32*5)/9

import java.util.Scanner;
public class thermal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celcius = (( 5 *(fahrenheit - 32.0)) / 9.0);
        System.out.println("Celcius: " + celcius);
        sc.close();
    }
}
