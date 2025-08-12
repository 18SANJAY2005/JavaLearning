package Test;

import java.util.Scanner;

public class maximum {
	public static void main(String[] args){ 
		System.out.println("--------------");
		Scanner sc = new Scanner(System.in); 
		int size =sc.nextInt(); 
		int[] arr =new int[size]; 
		for(int i=0;i<size;i++) 
		{ 
		arr[i]=sc.nextInt();
		}
		int max=Integer.MIN_VALUE; 
		int res=0; 
		for(int i=0;i<arr.length; i++){ 
		for(int j=i+1;j<arr.length;j++){ 
		res =arr[i]-arr[j]; 
		if (res<0)
		res=(res*(-2))+res; 
		if(max<res) 
		max=res; 
		} 
		} 
		System.out.println(max); 
}
}
