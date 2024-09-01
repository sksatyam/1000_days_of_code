//    A
//    AB
//    ABC
//    ABCD
//    ABCDE

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        int ascii = 65;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (ascii + j));
            }
            System.out.println();

        }
    }
}
