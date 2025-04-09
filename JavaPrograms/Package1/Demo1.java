package Package1;

public class Demo1 {
	public static void main(String[]args) {
		LargestNum(10,20);
		LargestNum(20,20);
		
	}
	public static void LargestNum(int a ,int b) {
		if (a>b) {
			System.out.println(a + " is largest");
		}else if (a==b) {
			System.out.println("a is equals to b");
		}else {
			System.out.println(b+ "  is largest");
			
		}
	}
}	
