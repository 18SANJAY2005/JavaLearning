package ArraysListProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		String[] arr = new String[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.next();
		}
		String x = sc.next();
	    
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains(x)) {
				al.add(i);
				
				
			}
		}
		System.out.println(al);
	}
     
}
