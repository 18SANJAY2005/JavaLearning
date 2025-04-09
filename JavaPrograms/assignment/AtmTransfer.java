package assignment;

import java.util.Scanner;

public class AtmTransfer {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount to withdraw");
	long amount=sc.nextLong();
	long account_balance=1000;
	System.out.println(AmountWithdraw( amount, account_balance));
	sc.close();
	
}
public static String AmountWithdraw(long amount,long account_balance) {
	if (((amount%100)==0)&&(amount>account_balance)){
		return "Transaction Successful";
		
		
	}
	else {
		return "You dont have sufficient balance or you have not entered the amoun in multiples of 100";
	}
}
}