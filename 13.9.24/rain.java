public class rain{
	public static void main(String[] args) {
		String beforeTemp = args[0];
		String currentTemp = args[1];
		int a = Integer.valueOf(beforeTemp);
		int b = Integer.valueOf(currentTemp); 

		if (a > b){
			System.out.println("it is going to rain");

		} else {
			System.out.println("it is not going to rain");
		}
	} 
		
	}  
		
	