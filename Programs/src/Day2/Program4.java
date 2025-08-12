package Day2;

import java.util.Arrays;

class Program4{
	public static void main(String[] args) {
		
	
int[] arr = {0,1,2,0,1};		
int l=0;
int m=0;
int r = arr.length-1; 
while(m<=r) {
	if(arr[m]==0) {
		arr[m]=arr[m]+arr[l]-(arr[l]=arr[m]);
		m++;
		l++;
	}
	else if(arr[m]==1)
		m++;
	else if(arr[m]==2) {
		arr[m]=arr[m]+arr[r]-(arr[r]-arr[m]);
		r--;
	}
}
System.out.println(Arrays.toString(arr));
}
}
