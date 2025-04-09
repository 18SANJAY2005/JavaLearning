package ArraysListPrograms2;

import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> original = new ArrayList<>();
		ArrayList<Student> List = new ArrayList<>();
        original.add(new Student("ABC",101));
        original.add(new Student("DEF",102));
        original.add(new Student("GHI",103));
        String keyName = "ABC";
        for(Student s:original) {
        	if(keyName.equals(s.name)) {
        		List.add(s);
        	}
        }
        if(List.size()!=0) {
        	System.out.println("removed");
        	System.out.println(List);
        }else {
        	System.out.println("Not Removed");
        }

	}
}
