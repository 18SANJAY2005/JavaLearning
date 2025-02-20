package Lopping;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int Num = sc.nextInt();
		sc.close();

		int count = 0;
		for (int i = 2; i <= Num/2; i++) {
			if (Num % i == 0) {
				count++;
			}
		}
			if (count==0) {
				System.out.println("it is a prime num");
			}else {
				System.out.println("it is not a prime num");
			}

		
		
	}

}
