import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Eneter First Number: ");
		int quotent = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int divisor = sc.nextInt();

		int gcd = 0;

		if (quotent < divisor) {
			int temp = quotent;
			quotent = divisor;
			divisor = temp;
		}

		// while (remainder != 0) {
		// quotent = divisor;
		// divisor = remainder;
		// remainder = quotent%divisor;
		// }
		for (int i = 1; i <= divisor; i++) {
			if ((quotent % i) == 0 && (divisor % i) == 0) {
				gcd = i;
			}
		}
		System.out.println("The GCD is: " + gcd);

	}
}
