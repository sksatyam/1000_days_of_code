package OOPS.Consepts;

class A{
    public void helloPrinter(){
        System.out.println("Hello! ");
    }
}
class B extends A{
    public void helloPrinter(){
        System.out.println("Hello From B");
    }
    public void notHelloPrinter(){
        System.out.println("Not Hello!");
    }
}
class C extends A{
    public void helloPrinter(){
        System.out.println("Hello from C! ");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // polymorphism: It refers to the ability of a single method, operator, or object to take on multiple forms. There are two types of polymorphism: compile-time polymorphism and run-time polymorphism.
        // Compile Time Polymorphis can be achived through method Overloading
        // Run time ploymorphism can be achived through method overriding
        A obj = new B();
        obj.helloPrinter();
        // obj.notHelloPrinter(); // this will throw an error because we a reference of variable of A type and notHelloPrinter() method is not defined in that class 
        obj = new C();
        obj.helloPrinter();
    }    
}
