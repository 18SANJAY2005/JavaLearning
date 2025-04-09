package Package1;

import java.util.Scanner;

public class Leap_Year {
	public static void main(String[]args) {
		Scanner i = new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int year = i.nextInt();
		System.out.println(year);
		leapYear(year);
		i.close();
	}

	public static void leapYear(int year) {
		if (((year%4==0))&&((year/100!=0))||((year%100==0))) {
			System.out.println("it is a leapYear");
		}else {
			System.out.println("it is not a leap year");
		}
		
	}


}
