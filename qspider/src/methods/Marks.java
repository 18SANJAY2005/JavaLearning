package methods;

public class Marks {
	public static void main(String[]args) {
		double Total =totalMarks(60,70,80);
		System.out.println(Total);
		
		double avgMarks = Total/3;
		System.out.println(avgMarks);
		
		
	    
		
	}
	public static double totalMarks(double Maths,double Physics,double Chemistry) {
		double res = Maths+Physics+Chemistry;
		
		
		return res;
		
		 
		
	}
	
	public static double avgMarks(double avg) {
		
		return avg ;
	}

}
