package Static_Method;

public class Assignment {
	public static void main(String[] args) {

		String car = car(60,75);
        System.out.println(car);

		}

		public static String car(int speedlimit,int speed ) {

			String s=speed>speedlimit?"overspeeding":"under limit";

			return s;

			

		}
}