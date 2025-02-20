package Lopping;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int x = sc.nextInt();
		System.out.println("Enter last number");
	    int y = sc.nextInt();
	    even(x,y);
	    odd(x,y);
	    sc.close();
	}
	 public static void even(int x,int y) { 
		 int sum=0;
		 int mul=1;
	    for (int i=x;i<=y;i++) {
	    	if (i%2==0) 
	    		sum+=i;
	    	    mul*=i;
	    }
	 
	            //System.out.println(i);
	    		System.out.println(sum);
	    		System.out.println(mul);

	 }
	  
	 public static void odd(int x,int y) {   
		 System.out.println("Odd Numbers");
		    for (int i=x;i<=y;i++) {
		    	if (i%2!=0)
		    		System.out.println(i);
		    }
	 }
}
	

	 
		
	


