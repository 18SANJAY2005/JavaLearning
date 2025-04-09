package LinkedList;

import java.util.LinkedList;

public class StudentDriver {
        public static void main(String[] args) {
			LinkedList<Student> ll = new LinkedList<Student>();
			ll.add(new Student("ZXC",104));
			ll.add(new Student("VXC",103));
			ll.add(new Student("NXC",102));
			ll.addFirst(new Student("ABC",101));
			ll.addLast(new Student("QWE",105));
//			ll.removeFirst();
//			ll.removeLast();
			System.out.println(ll.getFirst());
			System.out.println(ll.getLast());
			for(Student s:ll) {
				System.out.println(s);
			}
		}
}
