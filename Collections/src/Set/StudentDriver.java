package Set;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("ABC",101));
		set.add(new Student("BCD",102));
		set.add(new Student("ACD",103));
		set.add(new Student("ABC",101));
		
		
		System.out.println(set);
	}
	

}
