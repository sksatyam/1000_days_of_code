//20. *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
//    ****  ****
//    ***    ***
//    **      **
//    *        *

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        int noOfSpace = (userInp * 2) - 2;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < noOfSpace; j++) {
                System.out.print("  ");
            }
            noOfSpace -= 2;
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        noOfSpace += 4;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < (userInp - i - 1); j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < noOfSpace; j++) {
                System.out.print("  ");
            }
            noOfSpace += 2;
            for (int j = 0; j < (userInp - i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
