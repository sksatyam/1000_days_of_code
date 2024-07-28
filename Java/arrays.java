import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Theory on arrays:-
            Syntax: The syntax for declaring and initializing arrays is slightly different.

            Size: In C++, the size must be known at compile time for static arrays, whereas Java allows dynamic sizing with the new keyword.

            Bounds Checking: Java performs automatic bounds checking; C++ does not.
                
                Bounds checking refers to the process of verifying that an index used to access an array element is within the valid range of indices for that array. If an index is outside this valid range (either negative or greater than or equal to the array's length), the program should handle the situation appropriately, often by raising an error.

                In C++, bounds checking is not performed automatically. If you try to access an element outside the bounds of an array, the program does not raise an error, but instead accesses an invalid memory location, which can lead to undefined behavior, program crashes, or data corruption.

                In Java, bounds checking is performed automatically. If you try to access an element outside the bounds of an array, the Java runtime throws an ArrayIndexOutOfBoundsException. This helps prevent many types of errors and makes the program more robust.

            Multidimensional Arrays: Both languages support multidimensional arrays, but the syntax is different.

            Array as Objects: In Java, arrays are objects with properties and methods; in C++, arrays are not objects; In c++ the variable name of the array acts a pointer and points the first element of the array but in java doesn't.

            Dynamic Arrays: Dynamic arrays in C++ require manual memory management, while Java handles this automatically with garbage collection.
         
        
         */

 
        //  ways to declear and initalize an array and same goes for 2d array
        int[] arr; //Here Array is decleared but memory is not allocated for the array
        int arr1[]; //Here also the same case array is decleared but memory is not allocated

        arr = new int[5]; //Here we allocated memory for the arr. This is how we allocate memory for an array

        int[] arr2 = new int[10]; // Here we decleared and allocated memory to array in the same line
        int arr3[] = {1,2,3,4,5,6}; // This isi also allowed

        int[] arrtest;
        System.out.println("Enter the length of the array:- ");
        int temp = scan.nextInt(); // This is poossible in java but not in c++ because java allows automatic dynamic memory allocation.
        arrtest = new int[temp]; 
        System.out.println(arr3.length); //This function or method gives the length of the array



        // For Each loop in java same same as c++ it is used to iterate array
        // syntax for for each loop
        /*
        for (datatype new_variable_name_foritteration:Array_name){
            System.out.println(new_variable_name_foritteration);

            
        }
        */



    }
    
}
