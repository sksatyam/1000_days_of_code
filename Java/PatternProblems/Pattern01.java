// write a program to print the pattern below
// *****
// *****
// *****
// *****
// *****
import java.util.Scanner;
public class Pattern01 {
    public static void main(String[] args) {
        // Scanner Sc = new Scanner("System.in");
        System.out.print("Enter the Number of Rows: ");
        int userInp = new Scanner(System.in).nextInt();

        for (int i = 0; i < userInp; i++) {
            for(int j = 0; j<userInp;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
