package HomeWork;

import java.util.Arrays;

public class QN63_combine2array_in_3rd_array {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		for (int i = 0, k = arr2.length; i < arr1.length; i++) {
			arr3[i] = arr1[i];
			arr3[k] = arr2[i];
			k++;
		}
		System.out.println(Arrays.toString(arr3));
	}
}
