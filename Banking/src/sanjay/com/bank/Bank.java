package sanjay.com.bank;

public class Bank {
	public static void main(String[] args) {
		
			Account[] accounts = new Account[100];
			
			Account account= new Account(1001,1000.55,"Samjay");
			accounts[0] = account;
			System.out.println(account);
			
			System.out.println("Remaining balance after deposit :" + account.deposit(250));

			
			account.withdraw(200);
			System.out.println(account);
			
			account.getBalance();
			System.out.println(account);
			
			

		
	}

}
