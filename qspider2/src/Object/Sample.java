package Object;

public class Sample {
      public static void main(String[] args) {
		String s = "san";
		String s1 = new String("san");
		System.out.println(s1.hashCode());
		System.out.println(s.hashCode());
	}
}
