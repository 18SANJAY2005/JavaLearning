package NestedClass;

import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {
		ArrayList<Student> aa = new ArrayList<Student>();
		ArrayList<Student> bb = new ArrayList<Student>();
		aa.add(new Student("ABC", 101));
		aa.add(new Student("ECD",102));
		aa.add(new Student("GHI", 103));
		int id = 101;
		for(Student s : aa) {
			if(id==s.id) 
				bb.add(s);
			
		}
		aa.removeAll(bb);
		System.out.println(aa);
	}
}
