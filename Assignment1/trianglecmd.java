
public class trianglecmd {
    public static void main(String[] args){
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);
        float c = Float.parseFloat(args[2]);

        if((a < 0) || (b < 0) || (c <0) || (a+b <= c) ||
        (a+c <=b) || (b+c <=a)){
            System.out.println("Triangle is INVALID");
        }
        else{
            double p = (a+b+c);
            double s = p/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Perimeter: " + p);
            System.out.println("Area: " + area);
        }
    }
}
