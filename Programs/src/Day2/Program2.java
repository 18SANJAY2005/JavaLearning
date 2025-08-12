package Day2;

import java.util.ArrayList;
 
import java.util.Collections;

public class Program2 {
        public static void main(String[] args) {
              int[] arr = {16,17,4,3,5,2};
              ArrayList<Integer> list = new ArrayList<>();
              
              int leader = arr[arr.length-1];
              list.add(leader);
              for(int i=arr.length-2;i>=0;i++) {
            	  if(arr[i]>leader) {
            		  leader=arr[i];
            		  list.add(leader);
            	  }
              }
              Collections.reverse(list);
              for(int a : list) {
            	  System.out.println(a+" ");
              }
            
		}      
}
