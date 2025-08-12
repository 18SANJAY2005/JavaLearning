package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN51_remove_specified_element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[arr.length - 1];
		System.out.println("Enter the element to be removes : ");
		int index_ele = sc.nextInt();
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i != index_ele) {
				arr1[k] = arr[i];
				k++;

			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
