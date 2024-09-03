//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
//

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        int noOfStars = 1;
        for (int i = 0; i < userInp; i++) {
            for (int j = (userInp - i - 1); j > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            noOfStars += 2;
            System.out.println();

        }
        noOfStars -= 2;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j < noOfStars; j++) {
                System.out.print("* ");
            }
            noOfStars -= 2;
            System.out.println();
        }
    }
}
