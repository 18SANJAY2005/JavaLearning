package looping;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Palin palin = new Palin(num1);
		palin.isNumberPalindrome();
			
		Square.check(num1, num2);
		OddEven.even(num1, num2);
		OddEven.odd(num1, num2);
	}

}
