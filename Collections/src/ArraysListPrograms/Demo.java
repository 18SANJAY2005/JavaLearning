package ArraysListPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Demo {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("hi");
	al.add("hello");
	al.add("welcome");
	al.add("bye");
	ListIterator<String> it = al.listIterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("------------------");
	while(it.hasPrevious()) {
		System.out.println(it.previous());
	}
	
	
	
	
	
	
	
//	for(String a:al)
//	while(it.hasNext())
//		System.out.println(it.next());
//	System.out.println(it.next());
//	System.out.println(it.next());

}
}  
