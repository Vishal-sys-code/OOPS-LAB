import java.util.*;
public class stringrepeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // System.out.print("Enter the string: ");
        // String str = sc.nextLine();
        String str = "java";
        System.out.println("String Repetation: " + str.repeat(num));
        sc.close();
    }
}
