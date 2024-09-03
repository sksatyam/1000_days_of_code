//19. **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        int spaces = 0;
        for (int i = 0; i < (userInp); i++) {
            for (int j = 0; j < userInp - i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            spaces += 2;
            for (int j = 0; j < (userInp - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        spaces -= 2;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            spaces -= 2;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
