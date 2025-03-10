package looping;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base");
		int base = sc.nextInt();
		System.out.println("Enter the Power");
		int power = sc.nextInt();
		check(power, base);
		sc.close();

	}

	public static void check(int P, int B) {
		int a = 1;

		for (int i = a; i <= P; i++) {
			a *= B;

		}
		System.out.println(a);
	}

}
