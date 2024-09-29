import java.util.Scanner;

public class DIvisrsOfN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int num = sc.nextInt();

		System.out.print("The divisors are: ");
		for (int i = 1; i < num; i++) {
			if ((num % i) == 0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
