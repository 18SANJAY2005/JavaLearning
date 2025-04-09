package HomeWork;

public class QN64_index_same_leftandright_element {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 8, 9, 8 };
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] == arr[i + 1]) {
				System.out.println("The index value of element " + arr[i] + " is " + i);
			}
		}
	}
}
