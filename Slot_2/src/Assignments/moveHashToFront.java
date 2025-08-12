package Assignments;

import java.util.Scanner;

public class moveHashToFront {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		System.out.println(check(a));

		sc.close();
	}

	public static String check(String a) {
		StringBuffer sf1 = new StringBuffer();
		StringBuffer sf2 = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == '#') {
				sf1.append(a.charAt(i));
			} else {
				sf2.append(a.charAt(i));
			}

		}
		sf1.append(sf2);
		return sf1.toString();

	}
}
