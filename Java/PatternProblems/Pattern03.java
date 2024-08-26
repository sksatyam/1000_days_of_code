// Write a program to print the pattern given below
// 1
// 12
// 123
// 1234
// 12345

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = 1;i<=userInp;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        
    }
}
