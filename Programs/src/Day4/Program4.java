package Day4;

import java.util.Arrays;

public class Program4 {
	public static void main(String[] args) {
		
		int [] arr1 = {10,20,30,40};
		int [] arr2= {15,25,35,45};
		
		int i=0;
		int j=0;
		int k=0;
		
		int [] arr = new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) 
			{
				arr[k]=arr1[i];
				k++;
				i++;
			}
			else 
			{
				arr[k]=arr2[j];
				k++;
				j++;
			}
		}
			while(i<arr1.length) {
				arr[j]=arr1[i];
				
				k++;
				i++;
				
			}
			while(j<arr2.length) {
				arr[k]=arr2[j];
				k++;
				j++;
			}
			System.out.println(Arrays.toString(arr));
			
		}
		
		
	}