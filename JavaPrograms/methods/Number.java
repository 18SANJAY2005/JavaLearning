package methods;

public class Number {
	public static void main(String[]args) {
		int a = 123;
		int b = 456;
		int c = 789;
		int res = (a/100)*(b/10%10)*(c%10);
		System.out.println("res=" + res);
		
	}

}



//a = (a/100);
//b = (b/10%10);
//c = (c%10);
//System.out.println(a);
//System.out.println(b);
//System.out.println(c);
//System.out.println(d*s*f);