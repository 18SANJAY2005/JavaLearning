package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class QN45_46_47_leftrotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotation :  ");
		int rotate = sc.nextInt();
		Left_shift(rotate, arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void Left_shift(int rotate, int[] arr) {
		int n = arr.length;
		rotate = rotate % n;
		for (int i = 0; i < rotate; i++) {
			int temp = arr[0];
			for (int j = 1; j < n; j++) {
				arr[j - 1] = arr[j];
			}
			arr[n - 1] = temp;
		}
	}
}