package HomeWork;

import java.util.Arrays;

public class QN57_remove_duplicatearray {
	public static void main(String[] args) {
		int[] arr= {1,5,4,6,5,4};
		System.out.println(remove_duplicate(arr));
	}
	public static String remove_duplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=Integer.MIN_VALUE;}
			
		}
		}
		return newarr(arr);}
		
		
		public static String newarr(int[] arr) {
			int pos=0;
			int length=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=Integer.MIN_VALUE)
					length++;
			}
			int[] r=new int[length];
			for(int a:arr) {
				if(a!=Integer.MIN_VALUE)
					r[pos++]=a;
			}
			return Arrays.toString(r);
		}

}
