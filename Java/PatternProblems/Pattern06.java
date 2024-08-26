
/* Write a program to print 
    12345
    1234
    123
    12
    1

*/
import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows:");
        int userInp = sc.nextInt();

        for (int i = 0; i < userInp; i++) {
            for (int j = 1; j <= (userInp - i); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
