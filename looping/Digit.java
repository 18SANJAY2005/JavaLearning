package looping;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		  int rem =0;
	      while(num>0) {
		  int res = num%10;
		  rem=rem*10+res;
		  //System.out.println(res);
		  num/=10;
		  
		  
		}
	    System.out.println(rem);
		
	}

}
