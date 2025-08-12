package CollectionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp = arr[i];
				arr[i]=0;
				arr[k]=temp;
				k++;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
																				
	}
}
