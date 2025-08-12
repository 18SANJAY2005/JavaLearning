package WrapperClass;

public class GenricDriver {
      public static void main(String[] args) {
		Generic<Integer> g1 = new Generic<Integer>(10);
		Generic<Integer> g2 = new Generic<Integer>(20);
		System.out.println(g1==g2);

	}
}
