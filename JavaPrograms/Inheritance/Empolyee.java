package Inheritance;

public class Empolyee extends Person {
	int id;
	double salary;
	Empolyee(String name, int age, int id, double salary) {
		super(name, age);
		this.id = id;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Empolyee e1 = new Empolyee("san", 18, 123, 10000);  
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.id);
		System.out.println(e1.salary);
	}
	


}
