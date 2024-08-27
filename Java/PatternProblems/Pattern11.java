/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1

*/

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                int bChoice = 0;
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");

                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
