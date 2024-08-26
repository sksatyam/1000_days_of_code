
/*
Write a Program to print pattern given below 
 1
 22
 333
 4444
 55555
 */
import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        for (int i = 1; i <= userInp; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
