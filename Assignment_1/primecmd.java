
public class primecmd {
    public static void main(String[] args){
        //type-casting
        int n = Integer.parseInt(args[0]);

        int count = 0;

        for(int i=2;i<n/2;i++){
            if(n%i == 0){
                count = 1;
            }
        }

        if(count == 0){
            System.out.println(n + "  is a prime number");
        }
        else{
            System.out.println(n + "  is not a prime number");
        }

    }
}
