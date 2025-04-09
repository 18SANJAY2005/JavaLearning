package HashMapPrograms;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {
     public static void main(String[] args) {
		HashMap<Integer, String> m1 = new HashMap<Integer, String>();
		HashMap<Integer, String> m2 = new HashMap<Integer, String>();
		
		m1.put(101, "ABC");
		m1.put(102, "ATC");
		m1.put(103, "AMC");
		System.out.println(m1);
		
		m2.put(104, "TCD");
		m1.putAll(m2);
		System.out.println(m1);
		
		m1.replace(101, "MNB");
		System.out.println(m1);
		
		
		m1.remove(101);
		System.out.println(m1);
		
		System.out.println(m1.containsKey(102));
		System.out.println(m1.containsValue("AMC"));
		
//		Set<Integer> s = m1.keySet();
//		System.out.println("------------Keys------------");
//		for(Integer a : s) {
//			System.out.println(a);
//		}
//		
//		Collection<String> c = m1.values();
//		System.out.println("----------Values------------");
//		for(String b :c ) {
//			System.out.println(b);
//		}
		
		Set<Map.Entry<Integer, String>> set = m1.entrySet();
		for(Map.Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}
}
