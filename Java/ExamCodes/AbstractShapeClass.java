// Abstract class Shape
abstract class Shape {
    protected double dimension1;
    protected double dimension2;

    public Shape(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public abstract double area();
}
class Rectangle extends Shape {
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }
    public double area() {
        return dimension1 * dimension2; 
    }
}

class Triangle extends Shape {
    public Triangle(double base, double height) {
        super(base, height);
    }

    public double area() {
        return 0.5 * dimension1 * dimension2; 
    }
}

public class AbstractShapeClass {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5, 4); 
        System.out.println("Area of Rectangle: " + shape1.area());

        Shape shape2 = new Triangle(6, 3); 
        System.out.println("Area of Triangle: " + shape2.area());
    }
}
