package assignment;

import java.util.Comparator;

public class priceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Product s1=(Product)o1;
		Product s2=(Product)o2;
		
			return s1.price-s2.price;
				
	}

}