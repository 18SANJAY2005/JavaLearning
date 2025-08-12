package Static_Method;

public class Demo {
	public static void main(String[]args) {
		Demo s = new Demo();
		s.test();
		Demo2 s1 = new Demo2();
		s1.test2();
	}
	public void test() {
		System.out.println("hello");
	}

}
