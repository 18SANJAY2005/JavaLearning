package looping;



public class Palin {
	
	
	public static void check(int num) {
		
		int rem =0,num1=num;
	      while(num>0) {
		  int res = num%10;
		  rem=rem*10+res;
		  num/=10;
	}
	      //System.out.println(rem);
	      if(rem==num1) {
	    	  System.out.println(num1 +  " is Palindrome");
	      }else {
	    	  System.out.println(num1 +  " is Not Palindrome");
	      }
	    

	}
}
