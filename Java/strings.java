public class strings {
    public static void main(String[] args) {
        // There are two ways of creating an string
        String s1 = new String("Sanjib"); // in this way the literals are created into heap memory directly as objects 
        String s2 = "Sanjib"; // But in this way the literals are created into "string constant pool" which is reserved area in the heapp memory, this area is created to optimize the strings in java. when we creates a literal using this method if the literals is already exists in the string pool then it just create a new refference to that literal instead of creating of new literal into the memory to save memory.
        
        
        // Checking the equility of strings
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
        
    }
}
