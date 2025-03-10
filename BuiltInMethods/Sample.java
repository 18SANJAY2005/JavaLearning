package BuiltInMethods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sample {
	public static void main(String[] args) {
		
	
     String s1 ="Sanjay";
     String s2 = "hi who are you";
     String[] arr1=s2.split(" ");
     char[] arr = s1.toCharArray();
     byte[] arr2 = s2.getBytes();
     System.out.println(s1.concat(s2));
     System.out.println(Arrays.toString(arr));
     System.out.println(s1.charAt(0));
     System.out.println(s1.length());
     System.out.println(s1.toUpperCase());
     System.out.println(s1.indexOf('a'));
     System.out.println(s1.lastIndexOf('y'));
     System.out.println(Arrays.toString(arr1));
     System.out.println(Arrays.toString(arr2));
     
	}
}

