package Array2d;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Row Size");
		int a = sc.nextInt();
		System.out.println("Enter The Column Size");
		int b = sc.nextInt();
		System.out.println("Enter the Array Elements");
		int [][] arr = new int[a][b];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(min(arr));
	}
    public static int min(int[][]arr) {
    	int min=Integer.MAX_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr[0].length;j++) {
    			if(arr[i][j]<min){
    				min=arr[i][j];
    			}
    		}
    		
    	}
		return min;
    }
} 
