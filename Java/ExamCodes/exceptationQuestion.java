public class exceptationQuestion {
        public static void main(String[] args) {
            try {
                // Example 1: Arithmetic Exception
                int result = 10 / 0; // Division by zero
    
                // Example 2: Array Index Out of Bounds Exception
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // Accessing an invalid index
    
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception caught! ");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Index Out Of Bounds Exception caught! " );
            } catch (Exception e) {
                System.out.println("Exception caught: " );
            }

            System.out.println("Program continues...");
        }
    
}
