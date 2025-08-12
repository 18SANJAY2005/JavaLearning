package Day5;

public class Program2 {
           public static void main(String[] args) {
			String input = "***#";
			check(input);
		}
          
        	    public static void check(String s) {
        	       int count1 =0,count2=0;
        	       for(int i=0;i<s.length();i++) {
        	    	   if(s.charAt(i)=='*')
        	    		   count1++;
        	    	   else
        	    		   count2++;
        	       }
        	       if(count1==count2)
        	    	   System.out.println("balanced");
        	       else if(count1>count2)
        	    	   System.out.println(count1-count2 + "# should be added");
        	       else
        	    	   System.out.println(count2-count1 + "* should be added");
        	    }



        	

}
