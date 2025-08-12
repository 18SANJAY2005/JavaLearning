package Test;

import java.util.Scanner;

public class indexString {
	public static void main(String []args) { 
		System.out.println("-------------");
		Scanner sc =new Scanner(System.in); 
		String s =sc.nextLine(); 
		String b=s.toLowerCase(); 
	    int count=0; 
		for(int i=0; i<b.length()-1;i++) 
 { 
		
		if(b.charAt(i)!=b.charAt(i+1)) 
		 { 
		 
		count++; 
		 } 
 }
		 
		 
		 
		System.out.println(count); 

}
}
