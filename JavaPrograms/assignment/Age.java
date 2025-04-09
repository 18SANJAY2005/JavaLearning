package assignment;
import java.util.Scanner;

public class Age {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first age : ");
	int A=sc.nextInt();
	System.out.println("Enter second age : ");
	int B=sc.nextInt();
	System.out.println("Enter third age");
	int C=sc.nextInt();
	System.out.println(Youngest(A,B,C));
	sc.close();
	
}
public static String Youngest(int A,int B,int C) {
	if ((A<B)&&(A<C)){
		return "A is the youngest";
	}
	else if ((B<C)) {
		return" B is the youngest";
	}
	else {
		return " C is the youngest";
	}
}
}