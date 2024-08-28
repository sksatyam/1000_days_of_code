// 1
// 2 3
// 4 5 6
// 7 8 9 10 
// 11 12 13 14

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int userInp = sc.nextInt();
        sc.close();
        int counter = 1;
        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((counter++) + " ");
            }
            System.out.println();
        }
    }
}
