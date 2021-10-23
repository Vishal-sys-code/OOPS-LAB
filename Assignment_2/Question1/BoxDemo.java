
class Box{
    private double height,widht,depth;
    public void setData(double h, double w, double d){
        this.height = h;
        this.widht = w;
        this.depth = d;
    }
    double volume(){
        return height*widht*depth;
    }
}

public class BoxDemo{
    public static void main(String[] args){

        Box box1 = new Box();
        Box box2 = new Box();

        box1.setData(10, 3, 2);
        box2.setData(2, 5, 10);

        double volume1 = box1.volume();
        double volume2 = box2.volume();

        System.out.println("The volume of box1 is: " + volume1);
        System.out.println("The volume of box2 is: " + volume2);

        if(volume1 > volume2){
            System.out.println("The Dimensions of Box1 is larger");
        }
        else{
            System.out.println("The Dimensions of Box2 is larger");
        }
    }
}