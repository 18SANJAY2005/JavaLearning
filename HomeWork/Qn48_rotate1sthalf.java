package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Qn48_rotate1sthalf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Enter the number of rotation : ");
		int rotate = sc.nextInt();
		Rotate1sthalf(arr, rotate);
		System.out.println(Arrays.toString(arr));

	}

	public static void Rotate1sthalf(int[] arr, int rotate) {
		int n = arr.length;
		rotate %= n;
		for (int i = 0; i < rotate; i++) {
			int temp = arr[n / 2 - 1];
			for (int j = n / 2 - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
	}

}
