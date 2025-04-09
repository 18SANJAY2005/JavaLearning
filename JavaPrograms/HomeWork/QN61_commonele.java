package HomeWork;

public class QN61_commonele {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 5 };
		int[] arr1 = { 8, 9, 8, 4, 5, 6 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if (arr[i] == arr1[j]) {
					System.out.print(arr[i] + " ");
					System.out.println(arr1[i]);

				}

			}
		}
	}
}