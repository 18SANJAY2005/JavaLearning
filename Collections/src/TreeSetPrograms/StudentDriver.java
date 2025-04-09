package TreeSetPrograms;

import java.util.TreeSet;

public class StudentDriver {
          public static void main(String[] args) {
			TreeSet<Student> s = new TreeSet<Student>();
			s.add(new Student("ABC", 101));
			s.add(new Student("DEF", 102));
			s.add(new Student("HIJ",103));
			for(Student s1:s) {
			      System.out.println(s1);
			
		}
}
}