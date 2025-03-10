package HomeWork;

import java.util.Arrays;

public class QN35_swap_oddeven_indexed {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
