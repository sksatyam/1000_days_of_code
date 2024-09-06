import java.util.Scanner;

class ANum {
	public void afind(int n) {
		int temp = 0, cpy = n, ndig = (int) Math.log10(n);
		while (n > 0) {
			int m = 1;
			for (int i = 0; i <= ndig; i++) {
				m *= (n % 10);
			}
			temp += m;
			;
			n = n / 10;
		}
		if (cpy == temp) {
			System.out.println("True!");
		} else {
			System.out.println("False!");
		}
	}
}

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ANum obj = new ANum();
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();
		sc.close();

		obj.afind(num);
	}
}
