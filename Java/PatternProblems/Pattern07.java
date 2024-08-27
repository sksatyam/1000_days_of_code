/*
wtite a program to print the given pattern

     *
    ***
   *****
  *******
 *********
***********
*/ 

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rown: ");
        int userInp = sc.nextInt();
        sc.close();

        for (int i = 0; i < userInp; i++) {
            for (int j = 0; j < userInp+(userInp-1); j++) {
                if (j < userInp-i-1){
                    System.out.print("  ");
                }
                if (j>=userInp-i-1 && j<) {
                    System.out.print(" *");
                }

                
            }
            System.out.println();
            // System.out.println();
        }

    }    
}
