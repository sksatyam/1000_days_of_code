//    ABCDE
//    ABCD
//    ABC
//    AB
//    A

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = userInp; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((char) (65 + j) + " ");
            }
            System.out.println();
        }
    }
}
