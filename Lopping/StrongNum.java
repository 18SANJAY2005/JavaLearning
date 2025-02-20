package Lopping;

import java.util.Scanner;

public class StrongNum {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(check(num) ? num + "Strong Num" : num + "Not Strong Num");
		sc.close();
	}

	public static int fact(int num) {
		int rem = 1;
		while (num >= 1) {
			rem *= num;
			num--;

		}
		return rem;

	}

	public static boolean check(int num) {
		int sum = 0, num1 = num;
		while (num > 0) {
			int rem = num % 10;
			sum += fact(rem);
			num /= 10;
		}
		return sum == num1;
	}
}
