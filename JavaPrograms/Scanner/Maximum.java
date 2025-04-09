package Scanner;

public class Maximum {
	public static void main(String[]args) {
		System.out.println(max(10,20));
		System.out.println(max(10,20,30));
	}
	public static int max(int a , int b) {
		
		return (a>b) ? a:b;
		
	}
	public static int max(int a , int b, int c) {
		
		return (a>b) ? a:(b>c) ? b:c ;
	

}
}
