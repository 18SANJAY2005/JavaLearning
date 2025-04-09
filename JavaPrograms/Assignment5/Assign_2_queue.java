package Assignment5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assign_2_queue {
	public static void main(String[] args) {
	String arr[]= {"john","Emma","lucas","Sophia"};
	ArrayList <String> a=new ArrayList<String>();
	for(int i=0;i<arr.length;i++) {
		a.add(arr[i]);
	}
	System.out.println(a.toString());
	ListIterator<String>i=a.listIterator(a.size());
	while(i.hasPrevious()) {
		System.out.println(i.previous());
	}
}
}
