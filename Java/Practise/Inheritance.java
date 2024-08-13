package Practise;

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
    
    super(Model,Make,year);

    private int noOfDoors;
    private String convertible;

    // 
}

public class Inheritance {
    
}
