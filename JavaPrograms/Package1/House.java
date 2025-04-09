package Package1;

import java.util.Scanner;

public class House {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Basic Salary =");
		double basicSalary = sc.nextDouble();
		int year = sc.nextInt();
		System.out.println("Gross Salary: " + calcSalary(basicSalary,year));
		sc.close();
	}
	public static double calcSalary(double salary,int year) {
		double hra=0,da=0,ya=0;
		
		if(salary<=10000) {
			hra = salary*20/100;
			da = salary*80/100;
		}
		else if (salary<=20000) {
			hra = salary*25/100;
			da = salary*90/100;
		}
		else if (salary>20000) {
			hra = salary*30/100;
			da = salary*95/100;
		}
		else if (year>3) {
			ya =salary+=2500;
		}
		return salary + hra + da + ya;
		
	}
	

}
//32250.0
