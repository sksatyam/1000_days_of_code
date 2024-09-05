import java.util.Scanner;

class RevFn {
	public long rev(long n) {
		long revnum = 0;
		while (n != 0) {
			revnum = (revnum * 10) + (n % 10);
			n = n / 10;
		}
		return revnum;
	}
}

public class Palandrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RevFn obj = new RevFn();
		System.out.print("Enter a Number: ");
		long num = sc.nextLong();
		sc.close();

		long revNum = obj.rev(num);
		if (revNum == num) {
			System.out.println("Number is Palandrome!");
		} else {
			System.out.println("Not Palandrome!");
		}
	}
}
