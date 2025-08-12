package Inheritance;

public class Bot2 extends Bot1 {

	int id;

	Bot2(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public static void main(String[] args) {
            Bot2 b1 = new Bot2("san", 18, 124);
            Bot1 b2 = b1;
            Bot1 b3 = (Bot1)b1;
            System.out.println(b2);
            System.out.println(b3);
	}
}
