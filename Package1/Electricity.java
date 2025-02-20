package Package1;

import java.util.Scanner;

public class Electricity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units");
		double units = sc.nextDouble();
		System.out.println(units);
		checkUnits(units);
		sc.close();
	}
	public static void checkUnits(double unit) {
		double count =0;
		if (unit<=50) {
			count = unit*0.50;
			System.out.println("Bill =" + count);
		}
		else if (unit<=150) {
			count = 50*0.50 + (unit-50)*0.75;
			System.out.println("Bill =" + count);
					}
		else if (unit<=250) {
			count = 50*0.50 + 100*0.75 + (unit-150)*1.20;
			System.out.println("Bill =" + count);
		    
		}
		else if(unit>250) {
			count = 50*0.50 + 100*0.75 + 100*1.20 + (unit-250)*1.20*0.2;
			System.out.println("Bill =" + count);

		}
	}

}
