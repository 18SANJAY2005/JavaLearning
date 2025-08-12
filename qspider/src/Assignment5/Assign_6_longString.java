package Assignment5;

import java.util.ArrayList;
import java.util.Iterator;


public class Assign_6_longString {
	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("java");
		a.add("programming");
		a.add("code");
		a.add("language");
		a.add("algorithm");
		Iterator i=a.iterator();
		String max="";
		while(i.hasNext()){
			String s=(String)i.next();
			if(s.length()>max.length())
				max=s;
		}
		System.out.println(max);
	}
	
}
