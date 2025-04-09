package sanjay.com.bank;

public class Account {
	int accountId;
	double balance;
	String customeName;
	
	public Account(int accountId, double balance, String customerName) {
		this.accountId =accountId;
		this.balance = balance;
		this.customeName= customerName;
		
	}
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public double deposit(double Amount) {
		if (Amount <= 0) {
			throw new IllegalArgumentException("Amount must br greater than 0");
		}
		balance+=Amount;
		System.out.println("Deposited:" + Amount );
		return this.balance;
	}
	
	public void  withdraw(double Amount) {
		if (Amount <= 0) {
			throw new IllegalArgumentException("Amount must br greater than 0");
		}
		if (Amount > balance) {
			throw new IllegalArgumentException("low balance");
		}
		balance-=Amount;
		System.out.println("withdraw:" + Amount);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String toString() {
		return "Account ID: " + accountId + 
	               "Customer: " + customeName +
	               "Balance: " + balance;
		}
		
	

}
