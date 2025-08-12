package CollectionProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Program10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();

		System.out.println("Enter the elements:");
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); 
		double minAverage = Double.MAX_VALUE;

		for (int i = 0; i < size / 2; i++) {
			int min = arr[i];
			int max = arr[arr.length - 1 - i];
			double average = (min + max) / 2.0;

			if (average < minAverage) {
				minAverage = average;
			}
		}

		System.out.println( minAverage);
	}
}