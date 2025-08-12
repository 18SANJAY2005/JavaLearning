package CollectionProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program8 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		
		int size = sc.nextInt();		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a:arr)
		{
			
			map.put(a,map.getOrDefault(a,0)+1);
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}


}
