import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number:");
        int num = scan.nextInt();
        System.out.println("the Number is: "+num);
        scan.close(); // this will close the object scan so that our program can be memory efficient
    }
}
