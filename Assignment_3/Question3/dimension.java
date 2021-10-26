package Question3;

class Box{
    double height,width,length;

    Box(double l, double w, double h){
        this.length = l;
        this.width =  w;
        this.height = h;
    }
    double area(){
        return length*height*width;
    }
}

public class dimension {
    public static void main(String[] args){
        Box box1 = new Box(1,2,3);
        Box box2 = new Box(2,3,4);
        double area1 = box1.area();
        double area2 = box2.area();
        if(area1 > area2){
            System.out.println("Box1 is greater");
        }
        else{
            System.out.println("Box2 is greater");
        }
    }
}
