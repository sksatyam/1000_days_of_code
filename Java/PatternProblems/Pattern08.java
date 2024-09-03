// * * * * *
//  * * * *
//   * * *
//    * *
//     *

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        int noOfStars = userInp + (userInp - 1);

        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");

            }
            noOfStars = noOfStars - 2;
            System.out.println();
        }
    }
}
