package Scanner;

public class Assignmrnt {
	public static void main(String[]args) {
		print(5);
		print(7.88);
		print(true);
		print("hello");
		print('a');
		
	}
	public static void print(int a) {
		System.out.println(a);
	}
	public static void print(double d) {
		System.out.println(d);
	}
	public static void print(boolean b) {
		System.out.println(b);
	}
	public static void print(String s) {
		System.out.println(s); 
	}
	public static void print(char c) {
		System.out.println((int)c); 
	}
	
}
