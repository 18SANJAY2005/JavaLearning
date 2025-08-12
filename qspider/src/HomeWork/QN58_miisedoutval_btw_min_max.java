package HomeWork;

import java.util.Arrays;

public class QN58_miisedoutval_btw_min_max {
	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] arr = { 1, 2, 3, 4, 7, 5 };
		int[] arr1 = new int[arr.length - 2];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (arr[i] != min && arr[i] != max) {
				arr1[k] = arr[i];
				k++;
			}
		}

		System.out.println(Arrays.toString(arr1));

	}
}
