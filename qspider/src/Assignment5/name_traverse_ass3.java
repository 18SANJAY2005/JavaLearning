package Assignment5;
import java.util.ArrayList;
import java.util.ListIterator;
public class name_traverse_ass3 {
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Yash");
		a1.add("Mama");
		a1.add("Kolantha");
		a1.add("Silent Killer");
		a1.add("Ajuma");
		
		ListIterator<String> li = a1.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}
}
