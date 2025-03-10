package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Qn42_43_44_rightrotate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotation :  ");
		int rotate = sc.nextInt();
		Right_shift(rotate, arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void Right_shift(int rotate, int[] arr) {
		int n = arr.length;
		rotate = rotate % n;
		for (int i = 0; i < rotate; i++) {
			int temp = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
	}
}
