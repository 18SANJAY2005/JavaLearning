package CollectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Size");
		ArrayList<Integer> aa = new ArrayList<Integer>();
		ArrayList<Integer> rr = new ArrayList<Integer>();
		int size = sc.nextInt();
		for(int i=1;i<size;i++) {
			aa.add(sc.nextInt());
		}
		System.out.println(aa);
		System.out.println("Enter the size to be removed");
		int n = sc.nextInt();
		for(Integer s : aa) {
			if(n>s)
				rr.add(s);
		}
		aa.removeAll(rr);
		System.out.println(aa);
	}
}
