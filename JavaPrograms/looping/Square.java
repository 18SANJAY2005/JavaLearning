package looping;

public class Square {
	public static void check(int P, int B) {
		int a = 1;

		for (int i = a; i <= P; i++) {
			a *= B;

		}
		System.out.println(a);
	}
}
