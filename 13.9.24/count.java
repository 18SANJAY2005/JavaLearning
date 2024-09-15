public class count{
	public static void main(String[] args) {
	   String count = args[0];

	   int a = Integer.valueOf(count);

	   if (a > 1 || a < 8){
	   	System.out.println("Count is Ok");
	   } else {
	   	System.out.println("Count is not Ok");
	   }	
	}
}