public class defaultconstructor {
        int number;
        String name;
        void display(){
            System.out.println("Number: " + number + "    " + "Name: " + name);
        }
    public static void main(String[] args){
        defaultconstructor a = new defaultconstructor();
        defaultconstructor b = new defaultconstructor();
        a.display();
        b.display();
    }
}
