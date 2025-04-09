package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN53_remove_occurences {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 5, 4, 5 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to be removes : ");
		int ele = sc.nextInt();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele)
				count++;
		}
		int[] arr1 = new int[arr.length - count];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (arr[i] != ele) {
				arr1[k] = arr[i];
				k++;

			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}