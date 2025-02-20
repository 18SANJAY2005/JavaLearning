package Lopping;

import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= Num; i++) {
			if (Num % i == 0) {

				System.out.println(i);
			}

		}

	}

}
