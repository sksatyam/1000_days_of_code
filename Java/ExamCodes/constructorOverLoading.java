class Rectangle {

    private double length;
    private double breadth;

    public Rectangle() {
        this.length = 1.0;  
        this.breadth = 1.0; 
    }
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double area() {
        return length * breadth;
    }
}
public class constructorOverLoading {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        System.out.println("First Rectangle:");
        System.out.println("Area: " + rect1.area());
    
        Rectangle rect2 = new Rectangle(4, 7);
        System.out.println("Second Rectangle:");
        System.out.println("Area: " + rect2.area());
    }
}