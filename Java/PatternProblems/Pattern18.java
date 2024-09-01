//   E
//   D E
//   C D E
//   B C D E
//   A B C D E

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        int tracker = 64 + userInp;
        for (int i = 0; i < userInp; i++) {
            for (int j = i; j >= 0; j--) {
                System.out.print((char) (tracker - j));
            }
            System.out.println();

        }

    }
}
