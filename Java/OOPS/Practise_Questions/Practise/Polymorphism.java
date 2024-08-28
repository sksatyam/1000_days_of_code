// Create a base class shape with the method calculateArea(). Theen create a subclass Circle, Rectangle and Triangle. Each overiding the claculateArea() method to provide their specific implementaion. Demnstrate polymorphism by creating an array of shape objects and calculate the arae for different shapes. 

class Shape {
    public double calculateArea(double data) {
        return 0.0d;
    }

    public double calculateArea(double data1, double data2) {
        return 0.0d;
    }
}

class Circle extends Shape {
    public double calculateArea(double data) {
        return (data * data) * 3.14;
    }
}

class Rectangle extends Shape {
    public double calculateArea(double data1, double data2) {
        return data1 * data2;
    }
}

class Triangle extends Shape {
    @Override
    public double calculateArea(double data1, double data2) {
        return 0.5 * data1 * data2;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape area[] = new Shape[3];
        area[0] = new Circle();
        System.out.println(area[0].calculateArea(6d));

        area[1] = new Rectangle();
        System.out.println(area[1].calculateArea(12d, 12d));

        area[2] = new Triangle();
        System.out.println(area[2].calculateArea(6d, 4d));
    }
}
