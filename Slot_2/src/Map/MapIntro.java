package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIntro {
	public static void main(String[] args) {
		
		HashMap<Integer , String> m =new HashMap<>();
		m.put(2, "Ammu");
		m.put(3, "chota Bheem");
		m.put(6, "Kaliya");
		m.put(9, "vicky");
		m.put(4, "ram");
		System.out.println(m);
		m.put(4, "Chutki");
		System.out.println(m);
		System.out.println(m.get(4));
		System.out.println(m.remove(2));
		System.out.println(m.containsKey(9));
		System.out.println(m.containsValue("Kaliya"));
		
		Set<Integer> keys = m.keySet();
		for(Integer i : keys) {
			System.out.println(i+" : "+m.get(i));
			
		}
		ArrayList<String>values = new ArrayList<>(m.values());
		for(String name : values) {
			System.out.println(name);
		}
		Set<Map.Entry<Integer, String>>entry = m.entrySet();
		for(Map.Entry<Integer, String>e: entry) {
			System.out.println(e.getKey());
		}
		
		
	}

}