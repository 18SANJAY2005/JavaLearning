package CollectionProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the string : ");
		int size=sc.nextInt();
		int[]arr=new int[size];
		int max=Integer.MIN_VALUE;
		Integer element=null;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println(Arrays.toString(arr));
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int a:arr) {
			map.put(a,map.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Integer, Integer>entry : map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			if(entry.getValue()>max) {
				max=entry.getValue();
				element=entry.getKey();
			}
		}
		System.out.println("Element "+element+" is occured "+max+" times");
	}

}
