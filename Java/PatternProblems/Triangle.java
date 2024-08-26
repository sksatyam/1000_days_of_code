/*
Write a program to print the pattern
*
**
***
****
*****
*/
// Importing required Packages
import java.util.Scanner;


// Created public class 
public class Triangle {
	
	// main method
	public static void main(String[] args) {

		// creating object of Scanner class to take input from user
		Scanner sc  = new Scanner(System.in);

		System.out.print("Enter the number of Rows: ");
		int userInp = sc.nextInt();
		// System.out.println("\n");

		for (int i = 0; i < userInp; i++) {
			for (int j = 0 ;j <= i;j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}

	}
}
