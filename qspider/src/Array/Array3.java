package Array;
import java.util.*;
public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		sc.close();
		int count=0;
		int[] arr = {10,20,10,30,10,40,10};
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==num)
				count++;
		}
		int[] res = new int[arr.length-count];
		int pos =0;
		for(int a:arr) {
			if(a!=num)
				res[pos++]=a;
		}
		System.out.println(Arrays.toString(res));
	}

}
