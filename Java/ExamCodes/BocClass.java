class Box {
    double length;
    double breadth;
    double height;

    public Box(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class BocClass {
    public static void main(String[] args) {
        Box box1 = new Box(5, 4, 3); 
        System.out.println("Volume of Box 1: " + box1.volume());

        Box box2 = new Box(7.5, 6, 4.2); 
        System.out.println("Volume of Box 2: " + box2.volume());
    }    
}
