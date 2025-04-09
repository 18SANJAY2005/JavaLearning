package looping;

public class Palin {
	int num;

	public Palin(int inputNumber) {
		this.num = inputNumber;
	}

	public void isNumberPalindrome() {
		if (checkIfPalindrome())
			System.out.println(num + "is Palindrome");
		else
			System.out.println(num + "is not a Palindrome");
	}

	 boolean checkIfPalindrome() {

		int rem = 0, num1 = num;
		while (num > 0) {
			int res = num % 10;
			rem = rem * 10 + res;
			num /= 10;
		}

		return (rem == num1);

	}

}
