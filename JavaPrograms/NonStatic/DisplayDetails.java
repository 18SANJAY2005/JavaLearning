package NonStatic;

import java.util.Scanner;

public class DisplayDetails {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Empolyee e1 = new Empolyee(null, 0);
		System.out.println("Enter the name");
		e1.name = sc.next();
        System.out.println("Enter the salary");
		e1.salary = sc.nextDouble();
		
	   e1.getDetails();

	}
}
