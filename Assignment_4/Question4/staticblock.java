package Question4;
public class staticblock {
    static int a,b,c;
    static{
        System.out.println("First static block");
        a = 10;
    }
    static{
        System.out.println("Second static block");
        b = 20;
    }
    static{
        System.out.println("Third static block");
        c = 30;
    }
    public static void main(String[] args){
        System.out.println("Value of A : " + a);
        System.out.println("Value of B : " + b);
        System.out.println("Value of C : " + c);
    }
}
