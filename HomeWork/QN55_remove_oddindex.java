package HomeWork;

import java.util.Arrays;

public class QN55_remove_oddindex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			if (i % 2 != 0)
				count++;
		}
		int[] arr1 = new int[arr.length - count];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr1[k++] = arr[i];

			}
		}
		System.out.println(Arrays.toString(arr1));
	}

}
