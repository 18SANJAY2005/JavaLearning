package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		ArrayList<String>list = new ArrayList<String>(); 
		int size = sc.nextInt(); 
		String[] arr = new String[size]; 
		for(int i=0;i<size;i++) 
		{ 
		arr[i] = sc.next( );
		}  
		for(int i=0;i<arr.length;i++)  
		{ 
		if(arr[i].equals (reverse (arr[i])))  
		{ 
		list.add(arr[i]);  
		} 
		}  
		System.out.println(list);  
		} 
		public static String reverse (String a)  
		{ 
		String b="";  
		for(int i=a.length()-1;i>=0;i--) 
		{ 
		b+=a.charAt(i);  
		} 
		return b;  
		} 
} 


