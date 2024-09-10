package OOPS.Consepts;

public class final_keyword {
    // final keyword can be used with variables, methods and classes.
    // if we creates a variable with final keyword then a immutable variable is created.
    // Example:
    final int num1 = 12;
    // if we creates a method using final keyword then this method doesnt allows to be overridding in child classes
    public final void show(){
        System.out.println("Nothing!");
    }
    // if we create a class with final keyword then it doesntt allows inheritance.
    final class Hello{
        
    }
    
}
