package ArraysListProblems;

import java.util.Comparator;

public class nameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		People s1 = (People)o1;
		People s2 = (People)o2;
		return s1.name.compareTo(s2.name);
	}

}
