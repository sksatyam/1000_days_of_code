import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int Fac = 1;
        
        for (int i = 1; i <= n; i++) {
            Fac *= i;
        }
        System.out.println("Factorial is: "+Fac);
    }    
}
