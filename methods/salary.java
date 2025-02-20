package methods;

public class salary {
	public static void main(String[]args) {
		double salary = 45000;
		System.out.println("salary after bonus = " + bonus(salary));
		
	}
	public static double bonus(double salary) {
		return salary>=50000 ? salary+salary*10/100 : salary+salary*5/100;
	}
	

}
