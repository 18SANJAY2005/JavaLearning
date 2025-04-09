package stringPrograms;
import utils.*;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		
	  Logger l1 = new Logger();
      Scanner sc = new Scanner(System.in);
      String s1 = sc.next();
      String s2 = " ";
      for(int i=0;i<s1.length();i++) {
    	  s2+=(char)(s1.charAt(i)-32);
      }
      System.out.println(s2);
      l1.write(s2.toString());
      //System.out.println(s1.toUpperCase());
      
}}
