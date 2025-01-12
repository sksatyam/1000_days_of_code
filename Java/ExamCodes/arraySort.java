public class arraySort {


        public static void main(String[] args) {
            // Define an array
            int[] numbers = {45, 12, 78, 4, 89, 1, 56};
    
        
            int n = numbers.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
            printArray(numbers);
        }
    
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
}
