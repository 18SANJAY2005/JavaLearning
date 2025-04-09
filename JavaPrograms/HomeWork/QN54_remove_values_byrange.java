package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN54_remove_values_byrange {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range from : ");
		int starting_range = sc.nextInt();
		System.out.println("Enter the range till : ");
		int ending_range = sc.nextInt();
		int[] arr1 = new int[arr.length - (ending_range - starting_range) - 1];

		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i < starting_range || i > ending_range) {
				arr1[k] = arr[i];
				k++;

			}
		}
		System.out.println(Arrays.toString(arr1));

	}
}