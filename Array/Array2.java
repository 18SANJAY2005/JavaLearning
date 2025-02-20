package Array;

import java.util.*;

public class Array2 {
	public static void main(String[] args) {
		    System.out.println("Enter");
            Scanner sc = new Scanner(System.in);
            String [] arr = new String[3];
            
            for(int i=0;i<arr.length;i++) 
            	arr[i]=sc.next();
            //for (String a: arr)
            	//System.out.println(a);
            	
            	System.out.println(Arrays.toString(arr));
            
	}
}
