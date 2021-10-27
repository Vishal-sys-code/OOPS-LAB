// import Question4.staticblock;

class Complex {
    private int real,imaginary;
    private static int number;
    static{
        number = 0;
    }
    Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
        number++;
    }
    public static void displaycount(){
        System.out.println("Total number of complex number count: " + number);
    }
    public void displayexp(){
        if((this.imaginary)>0){
            System.out.println("Complex Number: " + real + "+" + imaginary + "i");
        }
        else{
            System.out.println("Complex Number: " + real + "-" + imaginary + "i");
        }
    }
    public static Complex sum(Complex c1, Complex c2){
        return new Complex(c1.real+c2.real, c1.imaginary+c2.imaginary);
    }
    public static Complex diff(Complex c1, Complex c2){
        return new Complex(c1.real-c2.real, c1.imaginary-c2.imaginary);
    }
    public double modulus(){
        return (Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imaginary,2)));
    }
    public static Complex product(Complex c1, Complex c2){
        int real = c1.real*c1.real - c2.imaginary*c2.imaginary;
        int imaginary = c1.real*c2.imaginary + c1.imaginary*c2.real;
        return new Complex(real, imaginary);
    }
    // public int complement(){
    //     return ((this.real)-(this.imaginary));
    // }
}

public class complex{
    public static void main(String[] args){
        Complex.displaycount();
        Complex c1 = new Complex(5, 6);
        Complex.displaycount();
        Complex c2 = new Complex(7, 8);
        Complex.displaycount();
        c1.displayexp();
        c2.displayexp();
        Complex sum = Complex.sum(c1, c2);
        Complex difference = Complex.diff(c1, c2);
        Complex product = Complex.product(c1, c2);
        // Complex complement1 = c1.complement();
        sum.displayexp();
        difference.displayexp();
        product.displayexp();
        // complement1.complement();
        Complex.displaycount();
    }
}