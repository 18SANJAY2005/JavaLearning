package Assignment5;

import java.util.ArrayList;
import java.util.ListIterator;

public class long_word_ass4 {
	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Java");
		a1.add("Programming");
		a1.add("Language");
		a1.add("Code");
		a1.add("Algorithm");

		ListIterator<String> li = a1.listIterator();

		String s1 = "";
		s1 = LongestWord(li);
		System.out.println("Longest word in the list is : " + s1);
	}

	public static String LongestWord(ListIterator<String> li) {
		String res = "";
		int max = 0;
		while (li.hasNext()) {
			String s1 = li.next();
			if (s1.length() > max) {
				max = s1.length();
				res = s1;
			}
		}
		return res;
	}
}
