package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sample {
      public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
	    System.out.println(set);
	    
	    ArrayList<Integer> list = new ArrayList<Integer>(set);
	    Collections.sort(list);
	    for(Integer i : list) {
	    System.out.println(i);
	    
	    LinkedHashSet<Integer> hh = new LinkedHashSet<Integer>();
	    hh.add(50);
	    hh.add(30);
	    hh.add(10);
	    System.out.println(hh);
	    
	    ArrayList<Integer> ff = new ArrayList<Integer>(hh);
	    Collections.sort(ff);
	    System.out.println(ff);
	}
}
}