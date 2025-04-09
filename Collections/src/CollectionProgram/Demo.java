package CollectionProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
	    System.out.println(list);
	    
	    
		
		for(int i=0;i<list.size();i++) {
			StringBuffer s1 = new StringBuffer(list.remove(0));
			s1.reverse();
			list.add(new String(s1));
			
			
		}
		System.out.println(list);
		
	}

}
