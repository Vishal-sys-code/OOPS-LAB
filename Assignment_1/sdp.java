import java.util.Scanner;
public class sdp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numbers");
        System.out.print("a: ");
        int number1 = sc.nextInt();
        System.out.print("b: ");
        int number2 = sc.nextInt();

        int sum=0,difference,product;

        sum = (number1+number2);

        if(number1>number2){
            difference = (number1-number2);
        }
        else{
            difference = (number2-number1);
        }

        product = (number1*number2);

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);

        sc.close();
    }
}
