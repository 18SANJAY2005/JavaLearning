package Static_Method;

public class Calc {
	public static void main(String[]args) {
		Calc s1 = new Calc();
		
		System.out.println("Addition :" + s1.add(10,20));
		System.out.println("Multiply :"+s1.mul(2, 5));
		System.out.println("Subraction :"+s1.sub(10,5));
		System.out.println("Division :"+s1.divd(20, 5));
		
		
		
	}
	
	public int add(int a , int b) {
		int f = a+b;
		return f;
	}
	public int mul(int c , int d) {
		int f1 = c*d;
		return f1;
	}
	public int sub(int e , int f) {
		 int f2 = e-f;
		return f2;
	}
	public int divd(int g , int h) {
		int f3=g/h;
		return f3;
	}
	

}
