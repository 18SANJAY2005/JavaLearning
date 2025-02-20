package Package1;

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount");
		int amount = sc.nextInt();
	    //System.out.println(amount);
		check(amount);
		sc.close();
	}
	public static void check(int amount) {
		int count=0;
		if (amount>500) 
		{
			count=amount/500;
			System.out.println("500 =" + count);
			amount%=500;
		}  
		if(amount>=200) 
		{
		  count=amount/200;
		  System.out.println("200 =" + count);
		  amount%=200;
		} 
		if(amount>=100)
		{
		   count=amount/100;	 
	       System.out.println("100 =" + count );
	       amount%=100;
		}
		if(amount>=50)
		{
		   count=amount/50;	 
	       System.out.println("50 =" + count );
	       amount%=50;
		}
		if(amount>=20)
		{
		   count=amount/20;	 
	       System.out.println("20 =" + count );
	       amount%=20;
		}
		if(amount>=10)
		{
		   count=amount/10;	 
	       System.out.println("10 =" + count );
	       amount%=10;
		}
	}

}
