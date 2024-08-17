package OOPS.Practise_Questions.Practise;

/*
Question: Create a class Vehicle with properties make, model, and year. Then create a subclass Car that adds properties like numberOfDoors and convertible. Write methods in both classes to display their respective details.
Focus: Understanding "is-a" relationships and using the extends keyword.
*/

class Vehicle{
    // Properties
    private String Model,Make;
    private int year;

    // Default Constructor Non Parameterised Connstructor
    Vehicle(){};

    // Parameterised Constructor
    Vehicle(String Model, String Make,int year){
        this.Make = Make;
        this.Model = Model;
        this.year = year;
    }

    // Setters
    void setMake(String Make){
        this.Make = Make;
    }

    void setModel(String Model){
        this.Model = Model;
    }

    void setyear(int year){
        this.year = year;
    }

    // Getter 
    int getyear(){
        return this.year;
    }

    String getMake(){
        return this.Make;
    }

    String getModel(){
        return this.Model;
    }

}

class Car extends Vehicle{
    // Properties
    private int noOfDoors;
    private String convertible;
    
    // Constructors
    Car(){};
    
    Car(String Model, String Make,int year){
        super(Model,Make,year);
    }
    
    Car(String Model, String Make,int year, int noOfDoors,String convertible){
        super(Model,Make,year);
        this.convertible = convertible;
        this.noOfDoors = noOfDoors;
    }

    // setters
    void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    void setConvertible(String convertible) {
        this.convertible = convertible;
    }

    // Getters
    public int getNoOfDoors() {
        return noOfDoors;
    }
    public String getConvertible() {
        return convertible;
    }
    @Override
    public String toString(){
        return "Make: " + getMake()+"\n"+"Model: "+ getModel()+"\n"+"Year: " + getyear() + "\n"+"No of Doors: "+getNoOfDoors()+"\n"+"Convertable: "+getConvertible();
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car(); 
        car.setModel("Dzire");
        car.setMake("Dont Know What is it");
        car.setyear(2024);
        car.setConvertible("No");
        car.setNoOfDoors(4);
        System.out.println(car);

    }
}
