package CollectionProgram;

import java.util.Scanner;
import java.util.TreeSet;

public class Program5 {
       public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("------------");
    	int size = sc.nextInt();
    	int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int a:arr) {
			set.add(a);
			
		}
		System.out.println(set.first());
		System.out.println(set.last());
	}
}
