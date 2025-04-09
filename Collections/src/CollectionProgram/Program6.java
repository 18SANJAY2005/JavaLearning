package CollectionProgram;

import java.util.Scanner;
import java.util.TreeSet;

public class Program6 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("-----------------");	

		TreeSet<Integer> t = new TreeSet<Integer>();
		int size=sc.nextInt();
		for(int i=1;i<size;i++) {
			t.add(sc.nextInt());
		}

		System.out.println("Enter the k value");
		int kValue = sc.nextInt();
		while(kValue>1) {
			t.remove(t.first());
			kValue--;
		}
		System.out.println(t.first());
	}
}
