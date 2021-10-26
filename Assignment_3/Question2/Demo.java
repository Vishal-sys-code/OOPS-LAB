package Question2;
class Box{
    private double length, width, height;

    Box(){
        System.out.println("Default Constructor");
    }

    Box(double l,double w, double h){
        System.out.println("Parameterized Constructor");
        this.length = l;
        this.width = w;
        this.height = h;
    }

    void display(){
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    double totalSurfaceArea(){
        return ((2*length*width)+(2*length*height)+(2*height*width));
    }
}


public class Demo{
    public static void main(String[] args){
        Box box1 = new Box();
        box1.display();
        Box box2 = new Box(1,2,3);
        box2.display();
        //double area1 = box1.totalSurfaceArea();
        //double area2 = box2.totalSurfaceArea();
        System.out.println("Area of Box1 is: " + box1.totalSurfaceArea());
        System.out.println("Area of Box2 is: " + box2.totalSurfaceArea());
    }
}