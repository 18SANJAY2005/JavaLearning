package Scanner;

import java.util.Scanner;

public class You {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("AGE =");
		int int1 = sc.nextInt();
		System.out.println(int1);
		
		System.out.println("CGPA =");
		double double1 = sc.nextDouble();
		System.out.println(double1);
		
		System.out.println("SECTION =");
		char at = sc.next().charAt(0);
		System.out.println(at);
		
		System.out.println("string =");
		String next = sc.next();
		String next2 = sc.nextLine();
		System.out.println(next+next2);
		//System.out.println(next2);
		sc.close();

		
		
		
	}

}
