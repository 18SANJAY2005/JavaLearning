
public class Avg{
	public static void main(String[] args) {
		String maths = args[0];
		String science = args[1];
		String english = args[2];
		String computer = args[3];
		String social = args[4];

		int a = Integer.valueOf(maths);
		int b = Integer.valueOf(science);
		int c = Integer.valueOf(english);
		int d = Integer.valueOf(computer);
		int e = Integer.valueOf(social);

		Avg avgObj = new Avg();
		double a1;
		a1 = avgObj.AverageNum(a, b, c, d, e);
		System.out.println(a1);

		//Program2 p2 = new Program2();
     
		
	}

	public double AverageNum(int A, int B, int C, int D, int E){
		double sum = A + B + C + D + E; 
		double Average = sum / 5;

		return Average;
	} 
}


class Program2 {
	public void method1() {
		System.out.println("I am in Program 2 - method 1");
	}
}
