package Package1;

import java.util.Scanner;

public class Charges {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println(age);
		checkAge(age);
		sc.close();
	}
	public static void checkAge(int age) {
		if (age<12) {
			System.out.println("the fare is 10₹");
		}else if (age>12&&age<60){
			System.out.println("the fare is 20₹");
		}else if (age>60){
			System.out.println("the fare is 15₹");
		}else {
			System.out.println("no ticket");
		}
	}

}
