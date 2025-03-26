package Inheritance;

public class Child extends Parent {
	void show() {
		System.out.println(b);
		display1();
	}
      public static void main(String[] args) {
    	Child c1 = new Child();
        
		System.out.println(a);
		display();
		c1.show();
	}
}
