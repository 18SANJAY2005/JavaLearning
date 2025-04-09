package ArraysListPrograms;

import java.util.ArrayList;

public class TestDriver {
 public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("tamil");
	list.add("maths");
	list.add("english");
	list.add("science");
	String s1 ="chennai";
	list.remove(0);
	System.out.println(list);
	System.out.println(list.remove(s1));
	//System.out.println(list.remove(1));
	String key = "tamil";
	if(list.contains(key)) {
		System.out.println("element is present");
	}else {
		System.out.println("element is not present");
	}
}
}
