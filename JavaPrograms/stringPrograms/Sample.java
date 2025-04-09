package stringPrograms;

import java.util.Scanner;

public class Sample {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2="";
	check(s1,s2);
}
  public static void check(String s1,String s2) {
	  for(int i=s1.length()-1;i>=0;i--) {
		  s2+=s1.charAt(i);}
		  if(s1.equals(s2)) {
			  System.out.println("Palindrome");
		  }else {
			  System.out.println("Not Palindrome");
		  }
	  }
  }

