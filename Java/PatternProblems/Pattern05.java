/*write a program to print the following pattern
*****
****
***
**
*
 */

import java.util.Scanner;

public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        int userInp = sc.nextInt();

        for (int i = userInp; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
