
// Write a program to get the number of digits in a number
import java.util.*;

class NDigit {
	public NDigit() {

	}

	public int bruteForce(int n) {
		int count = 0;
		while (n != 0) {
			n = n / 10;
			System.out.println(n);
			count++;
		}
		return count;
	}

	public int eff(int n) {
		int cnt = (int) (Math.log10(n) + 1);
		return cnt;
	}
}

public class noOfDigits {
	public static void main(String[] args) {
		NDigit obj = new NDigit();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		System.out.println("all ok!");
		int cnt = obj.bruteForce(num);

		System.out.println("There are " + cnt + " letters in " + num);
		cnt = obj.eff(num);
		System.out.println("There are " + cnt + " letters in " + num);

	}
}
