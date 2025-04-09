package ArraysListProblems;

import java.util.Comparator;

public class totalAmountComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Order s1 = (Order)o1;
		Order s2 = (Order)o2;
		return (int) (s1.totalAmount-s2.totalAmount);
	}
	

}
