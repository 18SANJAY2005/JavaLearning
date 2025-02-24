package looping;

import java.util.Scanner;

public class For {
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
		 System.out.println("Even Numbers");
	    for (int i=x;i<=y;i++) {
	    	if (i%2==0)
	    		System.out.println(i);
	    }
	 }
	 public static void odd(int x,int y) {   
		 System.out.println("Odd Numbers");
		    for (int i=x;i<=y;i++) {
		    	if (i%2!=0)
		    		System.out.println(i);
		    }
		 }
}

	 
		
	


