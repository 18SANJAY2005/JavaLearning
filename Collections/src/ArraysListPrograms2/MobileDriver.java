package ArraysListPrograms2;

import java.util.ArrayList;
import java.util.Collections;

public class MobileDriver {
	
	public static void main(String[] args) {
		
		
		ArrayList<Mobile> list = new ArrayList<Mobile>();
		
		list.add(new Mobile("Vivo", 25000, 6, 256));
		list.add(new Mobile("Apple", 125000, 16, 512));
		list.add(new Mobile("Samsung", 115000, 18, 256));
		list.add(new Mobile("Redmi", 15000, 6, 128));

		for(Mobile m : list)
		{
			System.out.println(m);
		}
		System.out.println("--------------------------");
		Collections.sort(list);
		
		for(Mobile m:list)
		{
			System.out.println(m);
		}
		System.out.println("----------------");
		System.out.println("Based On Ram");
		
		Collections.sort(list,new RamComparator());
		for(Mobile m : list) {
			System.out.println(m);
		}
		System.out.println("------------------------");
		System.out.println("Reverse");
		
		Collections.sort(list, Collections.reverseOrder());
		for(Mobile m1 : list) {
			System.out.println(m1);
		}
		
	}

}
