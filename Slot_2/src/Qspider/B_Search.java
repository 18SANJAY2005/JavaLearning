package Qspider;

public class B_Search {
    public static void main(String[] args) {
		
	}
    public static int check(int[] arr,int key, int low, int high) {
    	if(low>high) {
    		return -1;
    	}
    	int mid = (low+high)/2;
    	if(arr[mid]==key) {
    		return mid;
    	}else if(key>arr[mid]) {
    		return check(arr,key,mid+1,high);
    	}else if(key<arr[mid]){
    		return check(arr,key,low,mid-1);
    	}
    	return -1;
    }
} 
