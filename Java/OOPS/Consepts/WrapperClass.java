package OOPS.Consepts;

public class WrapperClass {
    // A wrapper class is an object representation of a primitive data type. It provides wrapper classes for all the eight primitive data types, allowing them to be treated as objects

    // Why deo we need Wrapper Classes?
    
    // Sometimes, we need to use primitives in contexts where objects are required, like in collections (List,  Map, etc.). Primitive types cannot be added directly to such collections, so wrapper classes are used to "wrap" the primitive values
    
    // Wrapper Class of all primative data types are:
    
    //              Primative Data Types            --->            Wrapper Class
    
    //              byte                            --->                Byte

    //              short                           --->                Short

    //              int                             --->                Integer

    //              long                            --->                Long

    //              float                           --->                Float
    
    //              double                          --->                Double

    //              char                            --->                Character
    
    //              boolean                         --->                Boolean

    public static void main(String[] args) {
        Integer num1 = new Integer(12); //  Assigning a value        // Depricated Warning: this means this syntax might be removed form the java in future
        Integer num2 = 12; // this is an another way to assign a value to it;

        int num3 = 15;

        Integer num4 = new Integer(num3);   //  Boxing: Stroing a primative value into Wrapper object is called boxing 
        // or 
        Integer num5 = num3;    // this is called Autoboxing because here num3 is automatically converted into Object

        Integer int5 = (Integer) num3; // Behind the sciens this is happening in auto boxing


        int num6 = num5.intValue();     // this is called unboxing
        
        int num7 = num5;        // This is called Auto-Unboxing

    }
    
}
