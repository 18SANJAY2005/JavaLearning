package Scanner;

public class OverLoading {
	public static void main(String[]args) {
		System.out.println(add(5,6));
		System.out.println(add(5,6,7));
		System.out.println(add(5,6,7,8));


		
	}
	
	public static int add(int a, int b) {
		return a+b;
		
	}
	public static int add(int a , int b, int c) {
		return a+b+c;
	}
	public static int add(int a , int b, int c ,int d) {
		return a+b+c+d;
	}

}
