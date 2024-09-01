//  * * * * *
//  *       *
//  *       *
//  *       *
//  * * * * *
//

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < userInp; j++) {
                if (i == 0 || i == (userInp - 1)) {
                    System.out.print("* ");
                } else if (j == 0 || j == (userInp - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
