
//        A
//       ABA
//      ABCBA
//     ABCDCBA
//    ABCDEDCBA
//

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the Number of Rows:");
        int userInp = sc.nextInt();
        sc.close();
        int charac = 65;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < (userInp - i - 1); j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (charac++) + " ");
            }
            if (i == 0) {
                charac = 65;
            }
            for (int j = 0; j < i; j++) {
                System.out.print((char) (charac--) + " ");
            }
            charac = 65;
            System.out.println();
        }
    }
}
