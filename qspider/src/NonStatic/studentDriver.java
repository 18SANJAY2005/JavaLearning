package NonStatic;

import java.util.Scanner;

public class studentDriver {
	public static void main(String[] args) {
		Student s1 = new Student(123, "Sanjay", 19);
		s1.addMarks(50);
		s1.addMarks(50);
		s1.addMarks(50);
		s1.addMarks(50);
		s1.addMarks(50);
		s1.getDetails();
		Student s2 = new Student(456, "San", 20);
		s2.addMarks(50);
		s2.addMarks(50);
		s2.addMarks(50);
		s2.addMarks(50);
		s2.addMarks(50);
		s2.getDetails();
	}
}
