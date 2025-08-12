package stringPrograms;

public class Prefix {
        public static void main(String[] args) {
			String[] arr = {"flower","flow","flight"};
			
			System.out.println(check(arr));
		}
        public static String check(String[]arr) {
        	int count=0;
        	String res="";
        	for(int i=0;i<arr[0].length();i++) {
        		char ch = arr[0].charAt(i);
        		count=0;
        		for(int j=1;j<arr.length;j++) {
        			
        	     if(i<arr[j].length()&&arr[j].charAt(i)==ch) 
        	    	 count++;
        	     }
        		if(count==arr.length-1) 
        			res+=ch;
        		else 
        			break;
        		}
        	return res;
        }
}


