package Qspider;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int key = sc.nextInt();
	  int size = sc.nextInt();
	  int[] arr = new int[size];
	  for(int i=0;i<size;i++) {
		  arr[i]=sc.nextInt();
	  }
	  System.out.println(check(arr,key));
	  
	
}
  public static int check(int [] arr, int key) {
	  Arrays.sort(arr);
	  int low=0;
	  int high = arr.length-1;
	  int mid = (low+high)/2;
	  while(low<high) {
		  if(arr[mid]==key) {
			  return mid;
		  }else if(key>arr[mid]) {
			  low = mid+1;
		  }else if (key<arr[mid]){
			  low = mid-1;
		  }
		  mid = (low+high)/2;
	  }
	  return -1;
  }
}
