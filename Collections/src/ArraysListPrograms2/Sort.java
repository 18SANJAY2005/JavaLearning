package ArraysListPrograms2;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
      public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("apple");
		list.add("pineapple");
		list.add("mango");
		System.out.println("Before Sorting : "  +  list);
		Collections.sort(list);
		System.out.println("After Sorting : "  +  list);
	}
}
