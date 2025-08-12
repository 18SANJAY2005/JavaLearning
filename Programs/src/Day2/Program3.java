package Day2;

import java.util.Arrays;

public class Program3 {
         public static void main(String[] args) {
			int [] arr = {1,3,4,6,8,6,5};
			int k=10;
			System.out.println(Arrays.toString(getArray(arr, k)));
			
		}
         public static int[] getArray(int[] arr, int k) {
        	 for(int i=0;i<arr.length;i+=k) {
        		 int s =i;
        		 int e = i+k-1>arr.length?arr.length-1:i+k-1;
        		 
        		 while(s<e) {
        			 arr[s] = arr[s]+arr[e]-(arr[e]=arr[s]);
        			 s++;
        			 e--;
        		 }
        	 }
        	 return arr;
         }
}