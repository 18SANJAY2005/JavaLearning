package Static_Method;

public class static2 {
	
		public static void main(String[] args) {

			int totalchocolate=30;

			int students=7;

		    System.out.println("Student recieved : "+chocolate(totalchocolate,students));

		    int z=totalchocolate%students;

		    System.out.println("Remainig:  "+z);
		    
		    String car = car(60,75);
	        System.out.println(car);

		    }

		public static int chocolate(int totalchocolate,int students ) {

			int s=totalchocolate/students;

			return s;

		}

		public static int remaining(int z) {

			return z;
	}
		public static String car(int speedlimit,int speed ) {

			String s=speed>speedlimit?"overspeeding":"under limit";

			return s;

			

		}

}
