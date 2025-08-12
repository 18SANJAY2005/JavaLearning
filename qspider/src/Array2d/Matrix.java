package Array2d;

import java.util.Arrays;


public class Matrix {
	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		int[][] arr1 = {{1,2},{3,4}};
		multiply(arr,arr1);
		
	}
	public static void multiply(int[][]arr,int[][]arr1) {
		int[][] res = new int[arr[0].length][arr.length];
		
		for(int i =0;i<res.length;i++) {
			for(int j =0;j<res[i].length;j++) {
               for(int k=0;k<res[0].length;k++) {
            		res[i][j]+=arr[i][k]*arr1[k][j];
    			}
               }
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(res));

	
	}


}
