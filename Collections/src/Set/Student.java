package Set;

import java.util.Objects;

public class Student {
	
	String name;
	int id;
	
	
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}



	@Override
	public int hashCode() {
//		return Objects.hash(id, name);
		return id+this.name.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return id == other.id && Objects.equals(name, other.name);
		
		
		Student s = (Student)obj;
		return this.name.equals(s.name)&&this.id==s.id;
	}
	
	

}
