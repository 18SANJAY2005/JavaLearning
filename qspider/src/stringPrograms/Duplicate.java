package stringPrograms;

public class Duplicate {
	public static void main(String[] args) {
		String s1 = "programmer";

		char[] ch = s1.toCharArray();
		
		System.out.println(ch);
        check(ch);
	}

	public static void check(char[] arr) {
		String res = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '0') {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == (arr[j])) {
						arr[j] = '0';
					}
				}
				res+=arr[i];
			}

		}
		System.out.println(res);
	}
}
