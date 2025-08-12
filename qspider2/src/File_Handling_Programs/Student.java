package File_Handling_Programs;

import java.io.Serializable;

public class Student implements Serializable {
	int age;
	String name;
	int id;
	transient String pw;

	public Student(int age, String name, int id, String pw) {
		super();
		this.age = age;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", id=" + id + ", pw=" + pw + "]";
	}
}
