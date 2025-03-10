package looping;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Num = sc.nextInt();
		sc.close();

		int count = 0;
		for (int i = 1; i <= Num; i++) {
			if (Num % i == 0) {
				count++;

			}

		}
		System.out.println(count);
	}

}
