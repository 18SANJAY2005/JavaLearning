package methods;

public class Robot {
	public static void main(String[]args) {
		double a = 45.5;
		boolean b = false;
		System.out.println(mission(a,b));
		
	}
	public static String mission(double a, boolean b) {
		String s =(a>=50)&&(b=true) ? "robot is in low poer mode":"robot is ready for mission";
		return s ;
		
	}

}
