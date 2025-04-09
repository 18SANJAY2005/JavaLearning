package Object;
import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1,Object o2) {

	
		Student1 s1 = (Student1) o1;
		Student1 s2 = (Student1) o2;

		return s1.age - s2.age;
	}

}
