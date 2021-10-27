package Question2;
public class distance {
    static double x1=1,x2=2,y1=3,y2=4;
    static double distanpoint(){
        return (Math.sqrt(((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2))));
    }
    public static void main(String[] args){
        double distance_between_two_points = distanpoint();
        System.out.println("Distance between two points is: " + distance_between_two_points);
    }
}
