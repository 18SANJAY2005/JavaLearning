package Inheritance;

import Inheritance.Parent1.child;

public class Driver {
     public static void main(String[] args) {
    	 Parent1 p2 = new Parent1();
		  Parent2 p1 = new Parent2();
		  child c1 = p2.new child();
		  System.out.println(c1.c);
		  System.out.println(p1.a);
		  //p1.display();
		  System.out.println(p1.b);
	}
}
