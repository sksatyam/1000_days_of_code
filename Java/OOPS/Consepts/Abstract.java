package OOPS.Consepts;


abstract class Car{
    // A abstract class can't be instinciated(can't create its object) only can extende but can create refference variable of that class type
    // A Abstract class can have both abstract and normal methods but a abstract method can only belong to an abstract class
    // abstract method means we are just declearing a method but not Defining and the class which will extend it have to define all the abstract methods in the class from which it is extending or it have to a abstract class too.
    public abstract void drive();
    public abstract void playMusic(String musicName);
    public void breaking(){     
        System.out.println("Car is Stopping"); 
    }

}

class Gwagon extends Car{
    public void drive(){
        System.out.println("Driving");
    }
    public void playMusic(String musicName){
        System.out.println("Playing Music "+ musicName);
    }
}
public class Abstract {

    public static void main(String[] args) {
        Car obj = new Gwagon();
        obj.breaking();
        obj.drive();
        obj.playMusic("Mamta Interlude");
    }
     
    
}
