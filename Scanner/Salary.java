package Scanner;

import java.util.Scanner;

public class Salary {
   public static void main(String[]args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("ENTER AGE");
	   int a = sc.nextInt();
	   System.out.println("his age is :" + a);
	   checkAge(a);
	   sc.close();
   }
   public static void checkAge(double a) {
	   if (a>=18) {
	       System.out.println("he is eligible to vote");
	   }else {
		   System.out.println("not eligible");
	   }
   }
}

//salary+=2500;
