package HomeWork;

import java.util.*;

public class Qn67 {
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
		System.out.println("Element frequencies:");
		for (int i = 0; i < n; i++) {
			if (visited[i])
				continue;
			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " -> " + count);
		}
	}
}
