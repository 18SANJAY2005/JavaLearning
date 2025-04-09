package LinkedList;

import java.nio.IntBuffer;
import java.util.LinkedList;

public class Demo {
          public static void main(String[] args) {
			LinkedList<Integer> ll = new LinkedList<Integer>();
			LinkedList<Integer> oo = new LinkedList<Integer>();
			ll.add(10);
			ll.add(20);
			ll.add(30);
			ll.add(40);
			ll.add(50);
			int s = 20;
			for(Integer i:ll) {
				if(i==s) {
					oo.add(i);
				}
			}
			ll.removeAll(oo);
			System.out.println(ll);
		}
}
