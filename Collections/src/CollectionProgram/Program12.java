package CollectionProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int carry =1;
		for(int i=arr.length-1;i>0;i--) {
			int sum = arr[i]+carry;
			if(sum==0) {
				arr[i]=0;
				carry=1;
			}else if(carry!=0) {
				arr[i]++;
				carry=0;
			}
		}
		if(carry==1) {
			int[] arr1 = new int[arr.length + 1];
			arr1[0]=1;
			System.out.println(Arrays.toString(arr1));
		}else {
		System.out.println(Arrays.toString(arr));
	}
}}