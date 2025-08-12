package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaDemo {
	public static void main(String[] args) {
		Comparator<Integer>c=(a,b)->b-a;
		ArrayList<Integer>a=new ArrayList<Integer>(List.of(1,2,3,5,5,40));
		System.out.println(a.get(0).toString());
		Collections.sort(a,new NumComparator());
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,c);
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		Collections.sort(a,(m,n)->n-m);
		System.out.println(a);
	}
}

class NumComparator implements Comparator<Integer>{
	@Override
	public  int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}