package Array;

import java.util.*;

public class Right {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30,40,50};
		System.out.println("Before RightRotate" + Arrays.toString(arr));
		System.out.println("Enter the number of Right Shifts");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j =0;j<num;j++) {
		int last = arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--) {
			if(i!=0)
			arr[i] = arr[i-1];
			else {
				arr[i] =last;
			}
			sc.close();
		}System.out.println("After RightRotate" + Arrays.toString(arr));
		
	}

}
}
