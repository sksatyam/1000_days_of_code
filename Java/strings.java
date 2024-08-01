public class strings {
    public static void main(String[] args) {
        // There are two ways of creating an string
        String s1 = new String("Sanjib"); // in this way the literals are created into heap memory directly as objects 
        String s2 = "Sanjib"; // But in this way the literals are created into "string constant pool" which is reserved area in the heapp memory, this area is created to optimize the strings in java. when we creates a literal using this method if the literals is already exists in the string pool then it just create a new refference to that literal instead of creating of new literal into the memory to save memory.
        
        
        // Checking the equility of strings

    }
}
