package ArraysListProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

import ArraysListPrograms2.Mobile;

public class PeopleDriver {
	public static void main(String[] args) {
		ArrayList<People> aa = new ArrayList<People>();
        aa.add(new People("John",101));
        aa.add(new People("Emma",102));
        aa.add(new People("Lucas",103));
        aa.add(new People("Sophia",104));
        
        System.out.println("------------------------");
		System.out.println("Reverse");
		
		Collections.sort(aa, new nameComparator());
		Collections.reverse(aa);
		for(People m1 : aa) {
			System.out.println(m1);
		}

	}
}
