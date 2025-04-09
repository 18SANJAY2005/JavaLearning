package BankingSystem;

import java.util.Scanner;

public class AccountDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account a = new  Account(10000);
		System.out.println("1.Withdraw");
		System.out.println("2.Deposite");
		System.out.println("3.Check Balance");
		System.out.println("4.Exit");
		
		System.out.println("Enter the option : ");
		int option = sc.nextInt();
		double am ;
		
		while(true) 
		{
			switch(option)
			{
			case 1:
				System.out.println("Enter the Amount:");
				am=sc.nextDouble();
				a.withdraw(am);
				break;
			case 2:
				System.out.println("Enter the Amount:");
				am=sc.nextDouble();
				a.deposite(am);
				break;
			case 3:
				a.checkBalance();
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Enter valid option : ");
			}
		}
	}

}
