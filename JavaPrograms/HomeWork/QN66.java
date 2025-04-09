package HomeWork;

import java.util.Scanner;

public class QN66 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		boolean[] visited = new boolean[n];
		System.out.println("Elements with at least one duplicate: ");
		boolean found = false;
		for (int i = 0; i < n - 1; i++) {
			if (visited[i])
				continue;

			boolean isDuplicate = false;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					visited[j] = true;
				}
			}
			if (isDuplicate) {
				System.out.print(arr[i] + " ");
				found = true;
			}
		}
		if (!found) {
			System.out.println("No duplicates found.");
		}
	}
}
