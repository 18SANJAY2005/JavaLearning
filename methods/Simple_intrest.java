package methods;

public class Simple_intrest {
	public static void main(String[]args) {
		operation(100.675,55.5,5.5);
	}
	public static void operation(double P , double N , double R ) {
		double res = P*N*R/100;
		System.out.println("The principal amount borrowed = " + (P));
		System.out.println("The number of periods = " + (N));
		System.out.println("he rate of interest per period = " + (R));
        System.out.println("simple intrest =" + (res));
	}

}
