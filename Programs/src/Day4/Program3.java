package Day4;

import java.util.Arrays;

public class Program3 {
       public static void main(String[] args) {
		
    	   int [] arr = {20,70,50,10};
    	   int [] arr1 = {15,45,25,35};
    	   Arrays.sort(arr);
    	   Arrays.sort(arr1);
    	   
    	   int [] res = new int[arr.length + arr1.length];
    	   
    	   for(int i=0;i<arr.length;i++) {
    		   res[i] = arr[i];
    	   }
    	   
    	   for(int i=0;i<arr1.length;i++) {
    		   res[arr.length+i] = arr1[i];
    	   }
    	   
    	  System.out.println(Arrays.toString(res));
 	}
 
}
