package Oops;

public class Box {
public static void main(String[] args) {
	Box b1 = new Box();
	Box b2 =b1;
//	Box b2 = new Box();
//	Box b3 = new Box();
	System.out.println(b1==b2);
}
}
