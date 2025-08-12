package Array;

import java.util.Arrays;

public class RightRotate {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Before RightRotate" + Arrays.toString(arr));
		int last = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			if(i!=0)
			arr[i] = arr[i-1];
			else {
				arr[i] =last;
			}
			
		}System.out.println("After RightRotate" + Arrays.toString(arr));
		
	}

}
