package Day3;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
    	int [] arr = {3,2,1,5,6,4};
    	int k =2;
    	Arrays.sort(arr);
    	System.out.println(check(k,arr));
		
	}
    public static int check(int k, int[] arr) {
    	int maxSum =0;
    	for(int i=0;i<=arr.length-k;i++) {
    		int windowSum=0;
    		for(int j=i;j<i+k;j++) {
    			windowSum += arr[j];
    		}
    		maxSum = Math.max(maxSum, windowSum);
    	}
    	return maxSum;
    }
}
