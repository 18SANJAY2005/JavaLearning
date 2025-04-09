package Array;

import java.util.*;

public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number : ");
		int[] arr = new int[5];
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i]==arr[j])
					arr[j]=Integer.MIN_VALUE;
			}
		}
           int count=0;
           for(int a:arr) {
        	   if(a == Integer.MIN_VALUE) {
        		   count++;
        	   }
           }
           int[] res = new int[arr.length-count];
           int pos =0;
           for(int a:arr) {
        	   if(a!=Integer.MIN_VALUE)
        		   res[pos++]=a;
           }
           if(count==0)
           System.out.println("No Dupicate");
           else
        	   System.out.println(Arrays.toString(res));
           sc.close();
	}
}

