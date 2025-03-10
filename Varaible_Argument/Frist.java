package Varaible_Argument;

public class Frist {
	public static void main(String[] args) {
		//demo();
		demo(20,10,30);
	}
	public static void demo(int...a) {
		System.out.println(a[0]);
	}

}
