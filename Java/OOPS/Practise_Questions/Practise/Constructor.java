// Create a class Person with properties name and age. Write multiple constructors: one that takes no arguments, one that takes only name, and one that takes both name and age. Demonstrate the use of these constructors by creating different Person objects.

class Persion {
    public Persion() {
        System.out.println("No Parameter constructor!....");
    }

    public Persion(int a) {
        System.out.println("One parameter constructor!...");
    }

    public Persion(int a, int b) {
        System.out.println("Two Parameter Constructor!....");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Persion p1 = new Persion();
        Persion p2 = new Persion(1);
        Persion p3 = new Persion(1, 2);
    }
}
