package Lopping;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0)
				sum+=i;
		}
		System.out.println(sum);
		if(num==sum) {
			System.out.println("Perfect Number");
		}else {
			System.out.println("Not Perfect Number");
		}
	}

}
