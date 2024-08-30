//Create a class Engine with properties like horsepower and type. Then create a class Car that contains an Engine object and additional properties like make and model. Write methods to start the car, which should include starting the engine.

class Engine {
    private String type;
    private int horsePower;

    public void start() {
        System.out.println("Starting Engine!....");
    }

    public Engine(int horsePower, String type) {
        this.horsePower = horsePower;
        this.type = type;

    }

    public int gethorsePower() {
        return this.horsePower;
    }

    public String gettype() {
        return this.type;
    }

}

class Car {
    String brand, model;
    Engine obj;

    public Car(int horsePower, String type, String brand, String model) {
        obj = new Engine(horsePower, type);
        this.brand = brand;
        this.model = model;
    }

    public void start() {
        System.out.println("Starting car!...");
        obj.start();
        System.out.println("Car Started!... ");
    }
}

public class InheritanceHas {
    public static void main(String[] args) {
        Car obj = new Car(122, "fourwheeler", "Audi", "R8");
        obj.start();

    }
}
