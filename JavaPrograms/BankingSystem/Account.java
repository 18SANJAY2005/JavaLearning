package BankingSystem;

public class Account {
	
	double balance;
	
	Account(double InitialAmount)
	{
		balance = InitialAmount;
	}
	
	public void withdraw(double amount)
	{
		if(amount>0&&balance>=amount)
		{
			balance-=amount;
		    //System.out.println("Current Balance : " + balance);
			checkBalance();
		}
		else
			System.out.println("Invalid");
	}
	public void deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
		    //System.out.println("Current Balance : " + balance);
			checkBalance();
		}
		else
			System.out.println("Invalid");
	}
	public void checkBalance()
	{
		System.out.println("Current Balance : " + balance);
	}

}
