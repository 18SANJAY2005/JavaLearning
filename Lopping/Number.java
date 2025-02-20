package Lopping;

import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int sum =0;
		while(num>0) {
		  int res = num%10;
		  System.out.println(res);
		  num/=10;
		  sum+=res;
		  
		}
		System.out.println(sum);
	}

}
