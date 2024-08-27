/* Write a program to print 
*
* *
* * *
* * * *
* * * * *
* * * * 
* * * 
* *
* 

*/

import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = (userInp - 1); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
