package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN52_Update_value {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[arr.length];
		System.out.println("Enter the index to be change : ");
		int ele = sc.nextInt();
		System.out.println("Enter the value to be updated : ");
		int val = sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr1[i] = arr[i];
		}
		arr1[ele] = val;
		;
		arr = arr1;
		System.out.println(Arrays.toString(arr));
	}
}
