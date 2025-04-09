package poly;

public class Parent {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		p1.display();
		child c1 = new child();
		c1.display();
		Parent p2 = new child();
		p2.display();
	}
        static void display() {
        	System.out.println("Parent");
        }
}
class child extends Parent{
	static void display() {
		System.out.println("Child");
	}
	
}
