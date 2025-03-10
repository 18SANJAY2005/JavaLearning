package NonStatic;

import java.util.Arrays;

public class Student {
	int id;
	String name;
	int age;
	String email;
	long phoneNo;
	static String collegeName = "abc college";
    static int count=0;
	{
		count++;
	}

	int[] mark = new int[5];
	static
	{
		System.out.println("Student Mangaement System");
	}

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;

	}

	Student(int id, String name, int age, String email, long phoneNo) {
		this(id, name, age);
		this.email = email;
		this.phoneNo = phoneNo;
	}

	
	int pos = 0;

	public void addMarks(int marks) {
           if(pos<mark.length) {
        	   mark[pos++]=marks;
           }else {
        	   System.out.println("All mark are stored");
           }
	}

	public void getDetails() {
		System.out.println(count);
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("College Name:" + collegeName);
		System.out.println("salary:" + age);
		System.out.println("email:" + email);
		System.out.println("phoneno:" + phoneNo);
		System.out.println("Marks : "+Arrays.toString(mark));
		System.out.println("Total : "+Tot(mark));
		System.out.println("Average: "+Avg(Tot(mark)));

	}

	public int Avg(int tot) {
		int a = tot/5;

		return a;
	}

	public int Tot(int[] mark2) {
		int sum=0;
		for(int a:mark2) {
			sum+=a;
		}
		return sum;
	}
}
