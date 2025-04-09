package Array;

import java.util.Arrays;

public class LeftRotate {
public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Before Rotate" + Arrays.toString(arr));
		int last = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1)
				arr[i] =last;
			else {
				arr[i] = arr[i+1];
				
			}
			
		}System.out.println("After Rotate" + Arrays.toString(arr));
		
	}

}


