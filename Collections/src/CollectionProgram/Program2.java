package CollectionProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Character> ch = new ArrayList<Character>();
		list.add("Hi");
		list.add("Hello");
		list.add("Welcome");
	    System.out.println(list);
	    for(String s:list) {
	    	for(int i=0;i<list.size();i++) {
	    	ch.add(s.charAt(0));
	    		break;
	    	}
			
			
		}
		System.out.println(ch);
		
	}

}
