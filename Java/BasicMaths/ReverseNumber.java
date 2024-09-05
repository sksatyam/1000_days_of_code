import java.util.Scanner;

class ReverseNum {
	public long rev(long n) {
		long revNum = 0;
		while (n != 0) {
			revNum = (revNum * 10) + (n % 10);
			n = n / 10;
		}
		return revNum;
	}
}

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ReverseNum obj = new ReverseNum();
		long num;
		System.out.print("Enter a Number: ");
		num = sc.nextLong();
		sc.close();

		System.out.println("Your reverse Number is: " + obj.rev(num));

	}
}
