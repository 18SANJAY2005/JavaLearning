package Qspider;

interface Abstract1 {
        default void m1() {
        	System.out.println("Parent 1 method");
        }
}

interface Abstract2{
	default void m1() {
		System.out.println("Parent 2 method");
	}
}

class Child implements Abstract1,Abstract2{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Abstract1.super.m1();
	
	
	
}
	}
