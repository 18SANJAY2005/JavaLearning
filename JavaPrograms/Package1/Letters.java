package Package1;

import java.util.Scanner;

public class Letters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("enter a letter");
		String cha = sc.next();
		System.out.println(cha);
		sc.close();
		
		
		switch(cha) {
		case "a","e","i","o","u":
			System.out.println("it is a vowel");
		    break;
		 default:{
			 System.out.println("it is not a vowel");
			 break;
			 
		 }
		}
			
		
	}

}
