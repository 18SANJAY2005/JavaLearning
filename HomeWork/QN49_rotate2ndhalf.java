package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN49_rotate2ndhalf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter the number of rotation : ");
		int rotate = sc.nextInt();
		Rotate2ndhalf(arr, rotate);
		System.out.println(Arrays.toString(arr));

	}

	public static void Rotate2ndhalf(int[] arr, int rotate) {
		int n = arr.length;
		rotate %= n;
		for (int i = 0; i < rotate; i++) {
			int temp = arr[n - 1];
			for (int j = n - 1; j >= n / 2; j--) {
				arr[j] = arr[j - 1];
			}
			arr[n / 2] = temp;
		}
	}

}
