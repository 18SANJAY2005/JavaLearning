package Package2;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner d = new Scanner(System.in);
		System.out.println("enter a number");
		int int1 = d.nextInt();
		System.out.println(int1);
		d.close();
		switch(int1) {
		case 1:{
			add(10,20);
			break;
		}
		case 2:{
			sub(30,20);
			break;
		}
		case 3:{
			mul(5,10);
			break;
		}
		case 4:{
			div(10,2);
			break;
		}
		}
		
		
		
		
		
	}
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int c, int d) {
		System.out.println(c-d);
	}
	public static void mul(int e, int f) {
		System.out.println(e*f);
	}
	public static void div(int g, int h) {
		System.out.println(g/h);
	}

}
