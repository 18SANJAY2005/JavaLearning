package CollectionProgram;

import java.util.Scanner;

public class Program13 {
	public static void main(String[] args) {
		System.out.println("------------");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String word = sc.next();
        String a = word;
		int k = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.contains(word)) {
				k++;
				word += a;
			}

		}
		System.out.println(k);
	}
}
