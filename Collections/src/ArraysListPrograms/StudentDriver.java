package ArraysListPrograms;

import java.util.ArrayList;

public class StudentDriver {
      public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("san",18,123));
		al.add(new Student("jay", 19, 124));
		Student s1 = new Student("zxc",13,145);
		al.add(s1);
		
		ArrayList<Student> a2 = new ArrayList<Student>();
        a2.add(new Student("dfg", 12, 156));
        a2.add(new Student("tyu", 22, 987));
        al.addAll(a2);
		//System.out.println(al);
		for(Student s:al) {
			System.out.println(s);
		}
	}
}
