package methods;

public class Sample {
	public static void main(String[]args) {
		numbers('A');
	}
	public static void numbers(char a) {
	        String res1 = (a>=48)&& (a<=57) ? "it is a number" : (a>=65)&& (a<=122) ? "it is a alphabet" : "it is a spicial" ;
	        System.out.println(res1);
	}
	
	

}
