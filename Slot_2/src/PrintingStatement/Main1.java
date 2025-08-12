package PrintingStatement;

import java.util.*;



public class Main1 {
     public static void main(String[] args) {
		List<java.lang.String> list = Arrays.asList("abc","def","hij");
		upperCaseConvert d1 = String :: toUpperCase;
		
		for(String s : list) {
			System.out.println(d1.accept(s));
		}
	}
}
