package OOPS.Consepts;
public class strings {
    public static void main(String[] args) {
        // There are two ways of creating an string
        String s1 = new String("Sanjib"); // in this way the literals are created into heap memory directly as objects, every time it will create a new object even if for the same string
        String s2 = "Sanjib"; // But in this way the literals are created into "string constant pool" which is reserved area in the heapp memory, this area is created to optimize the strings in java. when we creates a literal using this method if the literals is already exists in the string pool then it just create a new refference to that literal instead of creating of new literal into the memory to save memory.
        
        // Difference in == operator and .equals() method
        /*
        '==' Operator
        
        Comparison Type: It is used for reference comparison.
        Behavior: Checks if two references point to the same memory location (i.e., if they are the exact same object).
        Usage: Primarily used for primitive types and to check if two object references are identical.
        
        */ 
        
        /*
        equals() Method
        
        Comparison Type: It is used for value comparison.
        Behavior: Checks if two objects are logically equivalent, meaning their content is the same.
        Usage: Should be overridden in a class to compare the values of objects of that class
        
        */
        
        // Checking the equility of strings
        String s3 = new String("Sanjib");
        boolean bool = s1 == s3 ? true:false; // even if the both strings are same but the value stored in the bool is false because == operators coompares refferences only and s1 and s3 are at different memory location as they both are created using new keywords so two different objects are created for them in heap memory. So to compare values we uses equals() methhod
        System.out.println(bool);

        // In Java strings are immutable because when we changes the value then it starts reffering to new object not changes and later on java's garbage collector removes it from memory.

    }
}
