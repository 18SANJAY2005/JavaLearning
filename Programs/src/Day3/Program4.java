package Day3;

public class Program4 {
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(check(s));

	}

	public static int check(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {

				String str = s.substring(i, j + 1);
				if (isPalindrome(str) && str.length() > 1)
					count++;
			}
 		}
		return count;
	}

	public static boolean isPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}